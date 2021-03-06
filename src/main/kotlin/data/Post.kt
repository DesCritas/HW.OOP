package data

import data.attachment.*

data class Post(
    val id: Int = 0,
    val ownerId: Int,
    val fromId: Int,
    val createdBy: Int,
    val date: Int,
    val text: String,
    val replyOwnerId: Int,
    val replyPostId: Int,
    val friendsOnly: Boolean,
    val comments: Comments,
    val copyright: Copyright?,
    val likes: Likes,
    val reposts: Reposts,
    val views: Views,
    val postType: PostType,
    val postSource: PostSource = PostSource(data1 = "Likes"),
    val attachments: Array<AttachmentIntrface>?,
    val geo: Geo?,
    val signerId: Int,
    val copyHistory: Array<Post>?,
    val canPin: Boolean,
    val canDelete: Boolean,
    val canEdit: Boolean,
    val isPined: Boolean,
    val markedAsAds: Boolean,
    val isFavorite: Boolean,
    val donut: Donut,
    val postponedId: Int
    )  {
    constructor(id:Int,ownerId: Int,date: Int):this(id,
        ownerId,
        fromId = 3,
        createdBy = 4,
        date,
        text = "FirstPost!",
        replyOwnerId = 6,
        replyPostId = 7,
        friendsOnly = true,
        Comments(8, canPost = true, groupCanPost = true, canClose = true, canOpen = true),
        Copyright(9, "https://copyright.com", "Netology", "OpenSource"),
        Likes(10, userLikes = true, canLike = true, canPublish = true),
        Reposts(11, true),
        Views(12),
        PostType.COPY,
        PostSource(data1 = "likes"),
        attachments = arrayOf(
            AttachmentAudio(AttachmentType.AUDIO, Audio()),
            AttachmentGraffity(AttachmentType.GRAFFITY, Graffity()),
            AttachmentPhoto(AttachmentType.PHOTO, Photo()),
            AttachmentGraffity(AttachmentType.GRAFFITY, Graffity()),
            AttachmentNote(AttachmentType.NOTE, Note())
        ),
        Geo(),
        signerId = 13,
        copyHistory = emptyArray(),
        canPin = true,
        canDelete = true,
        canEdit = true,
        isPined = true,
        markedAsAds = true,
        isFavorite = true,
        Donut(true, 14, Placeholder("какое-то сообщение"), true, EditMode.ALL),
        15)

    }
