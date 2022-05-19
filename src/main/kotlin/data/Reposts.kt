package data

class Reposts(
    var count: Int,
    var userReposted: Boolean
) {
    override fun toString(): String{
        return "Количество репостов: $count"
    }

}
