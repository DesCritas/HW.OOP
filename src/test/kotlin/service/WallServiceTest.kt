package service

import data.Post
import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add() {
        WallService.postsCleaner()
        WallService.add(Post(0,2,5))
        val controlledPost = Post(1,2,5)

        val result = WallService.add(controlledPost)

        assertEquals(0,result.id)
    }

    @Test
    fun update() {
    }

    @Test
    fun printAllPosts() {
    }
}