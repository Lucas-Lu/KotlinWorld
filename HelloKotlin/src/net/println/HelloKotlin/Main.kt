package net.println.HelloKotlin

/**
 * Created by luliju on 2017/6/18.
 */
fun main(args: Array<out String>){
    println("Hello World!")
    println(UserInfo(0,"Lucas"))
}

data class UserInfo(val id:Int,val name:String)