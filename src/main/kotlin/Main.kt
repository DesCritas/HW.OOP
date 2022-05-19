import data.*
import service.WallService

fun main() {
    val service = WallService
    val post1 = Post(
        0,
        2,
        3,
        4,
        5,
        "FirstPost!",
        6,
        7,
        true,
        Comments(8, canPost = true, groupCanPost = true, canClose = true, canOpen = true),
        Copyright(9, "https://copyright.com", "Netology", "OpenSource"),
        Likes(10, userLikes = true, canLike = true, canPublish = true),
        Reposts(11, true),
        Views(12),
        PostType.COPY,
        13,
        canPin = true,
        canDelete = true,
        canEdit = true,
        isPined = true,
        markedAsAds = true,
        isFavorite = true,
        Donut(true, 14, Placeholder("какое-то сообщение"), true, EditMode.ALL),
        15
    )
    val post2 = Post(
        16,
        17,
        18,
        19,
        20,
        "FirstPost!",
        21,
        22,
        true,
        Comments(23, canPost = true, groupCanPost = true, canClose = true, canOpen = true),
        Copyright(24, "https://copyright.com", "Netology", "OpenSource"),
        Likes(25, userLikes = true, canLike = true, canPublish = true),
        Reposts(26, true),
        Views(27),
        PostType.COPY,
        28,
        canPin = true,
        canDelete = true,
        canEdit = true,
        isPined = true,
        markedAsAds = true,
        isFavorite = true,
        Donut(true, 29, Placeholder("какое-то сообщение"), true, EditMode.ALL),
        30
    )
    service.add(post1)
    service.add(post2)
    service.printAllPosts()
    service.update(post1)
    service.printAllPosts()
}