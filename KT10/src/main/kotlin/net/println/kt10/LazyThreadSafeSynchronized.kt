package net.println.kt10.kotlin

/**
 * Created by luliju on 2017/7/8.
 */
class LazyThreadSafeSynchronized private constructor() {
    companion object {
       private var instance: LazyThreadSafeSynchronized? = null

        @Synchronized
        fun get(): LazyThreadSafeSynchronized{
            if(instance == null) instance = LazyThreadSafeSynchronized()
            return instance!!
        }
    }

}