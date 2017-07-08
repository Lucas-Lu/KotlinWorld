package net.println.kt10.kotlin

/**
 * Created by luliju on 2017/7/8.
 */
class LazyThreadSafeStaticInnerObject private constructor(){
    companion object{
        fun getInstance() = Holder.instance
    }

    private object Holder{
        val instance = LazyThreadSafeStaticInnerObject()
    }
}