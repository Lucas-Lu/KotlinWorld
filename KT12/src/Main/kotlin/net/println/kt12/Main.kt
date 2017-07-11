package net.println.kt12

import java.io.File

/**
 * Created by luliju on 2017/7/11.
 */
fun main(args: Array<String>) {

    val jsonData = File("singer.json").readText()
    val result = Gson().fromJson(jsonData,Singer::class.java)
    println(result)
}