package data

class Likes(
    var count: Int,
    var userLikes: Boolean,
    var canLike: Boolean,
    var canPublish: Boolean
) {
    override fun toString(): String{
        return "Лайки: $count"
    }

}
