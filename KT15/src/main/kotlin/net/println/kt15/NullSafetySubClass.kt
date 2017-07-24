package net.println.kt15

import java.util.*

/**
 * Created by luliju on 2017/7/19.
 */
class NullSafetySubClass:NullSafetyAbsClass(){
    override fun formatDate(date: Date): String {
         return date.toString()//To change body of created functions use File | Settings | File Templates.
    }
}

fun main(args:Array<String>){
    val nullSafetyAbs = NullSafetySubClass()
    print(nullSafetyAbs.formatDate(Date()))
}