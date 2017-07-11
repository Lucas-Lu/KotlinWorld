package net.println.kt12

/**
 * created by luliju on 2017/7/11.
 */
data class BaseResult<Content>(val code: Int, val message: String, val content: Content)

data class Song(val id: Long, val name: String)

data class Singer(val id: Long, val name: String, val songs: List<Song>)
