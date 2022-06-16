package service

import data.*

object WallService {
    private var posts = emptyArray<Post>()

    private var comments = emptyArray<Comment>()

    fun createComment(postId: Int, comment: Comment): Comment {
        for (post in posts){
            if (post.id == postId){
                comments += comment
                println(comments.get(comments.size-1))
                return comments.get(comments.size-1)
            }
        }
        throw PostNotFoundException("no post with id: $postId")
    }

    fun postsCleaner(){
        posts = emptyArray()
    }

    fun add(post: Post): Post{
        val postId = post.copy(id = (if (posts.isEmpty()) 1 else posts.last().id +1))
        posts += postId
        return posts.last()
    }

    fun update(postUpdate: Post): Boolean {
        val (id) = postUpdate
        var status = false
        for ((index, post) in posts.withIndex()) {
            if (post.id == id) {
                posts[index] = post.copy(
                    fromId = 200,
                    createdBy = 200,
                    text = "Updated Post!",
                    replyOwnerId = 200,
                    replyPostId = 200,
                    friendsOnly = false,
                    comments = Comments(200, canPost = false, groupCanPost = false, canClose = false, canOpen = false),
                    copyright = Copyright(200, "https://netology.ru", "copyrightIsEmpty", "OpenSource"),
                    likes = Likes(200, userLikes = false, canLike = false, canPublish = false),
                    reposts = Reposts(200, false),
                    views = Views(200),
                    postType = PostType.POSTPONE,
                    geo = null,
                    signerId = 200,
                    canDelete = false,
                    canEdit = false,
                    canPin = false,
                    isPined = false,
                    markedAsAds = false,
                    isFavorite = false,
                    donut = Donut(false, 29, Placeholder("это проплаченный пост"), false, EditMode.DURATION),
                    postponedId = 200
                )
                status = true
                return status
            } else status = false
        }
        return status
    }

    fun printAllPosts(){
        for (post in posts){
            println(post.toString())
        }
    }
}