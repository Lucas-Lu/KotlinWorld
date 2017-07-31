package net.println.kt15

/**
 * Created by luliju on 2017/7/19.
 */
fun main(args:Array<String>){
    var list = ArrayList<Any>()
    list.add("Hello")
    list.add(0)
    list.map(::println)
}