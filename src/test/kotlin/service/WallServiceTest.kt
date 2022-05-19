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

        assertEquals(2,result.id)
    }

    @Test
    fun updateTrue() {
        val service = WallService
        service.postsCleaner()
        service.add(Post(0,2,5))
        service.add(Post(2,4,8))
        service.add(Post(7,10,125))
        val controlledPost = Post(1,2,5)

        val result = service.update(controlledPost)

        assertTrue(result)
    }
    @Test
    fun updateFalse() {
        WallService.postsCleaner()
        WallService.add(Post(0,2,5))
        WallService.add(Post(2,4,8))
        WallService.add(Post(7,10,125))
        val controlledPost = Post(7,111,5)

        val result = WallService.update(controlledPost)

        assertFalse(result)
    }

}