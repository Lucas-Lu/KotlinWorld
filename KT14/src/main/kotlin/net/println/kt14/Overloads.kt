package net.println.kt14

/**
 * Created by luliju on 2017/7/17.
 */
class Overloads {
    @JvmOverloads fun overloads(a:Int, b:Int = 2, c:Int = 3){
        println("$a,$b,$c")
    }
}