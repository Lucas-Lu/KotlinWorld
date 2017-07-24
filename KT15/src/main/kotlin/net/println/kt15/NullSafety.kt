package net.println.kt15

/**
 * Created by luliju on 2017/7/19.
 */
fun main(args:Array<String>){
    val nullSafetyJava = NullSafetyJava()
    val data:String = nullSafetyJava.data
    val dataCanBeNull:String? = nullSafetyJava.data
    print(data)
}