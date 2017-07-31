package net.println.kt15

/**
 * Created by luliju on 2017/7/19.
 */
@Volatile var count: Int = 0

fun count(){
    synchronized(count){
        count ++
    }
}