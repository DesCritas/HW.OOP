import data.*
import service.WallService

fun main() {
    val service = WallService
    val post1 = Post(1,2,3)
    val post2 = Post(0,17,18)

    service.add(post1)
    service.add(post2)
    service.printAllPosts()
    service.update(post1)
    service.printAllPosts()
}