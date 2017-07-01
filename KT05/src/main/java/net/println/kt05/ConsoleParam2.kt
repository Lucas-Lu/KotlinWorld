package net.println.kt05

/**
 * Created by luliju on 2017/7/1.
 */
public fun main(vararg args:String) {
    args.flatMap {
        it.split('_')
    }.map {
        print("$it  ")
    }

}