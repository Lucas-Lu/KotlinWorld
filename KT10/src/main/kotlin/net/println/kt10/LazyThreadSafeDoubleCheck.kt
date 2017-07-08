package net.println.kt10.kotlin

/**
 * Created by luliju on 2017/7/8.
 */
class LazyThreadSafeDoubleCheck private constructor(){
    companion object{
        val instance by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED){
            LazyThreadSafeDoubleCheck()
        }

        private @Volatile var instance2: LazyThreadSafeDoubleCheck? = null

        fun get(): LazyThreadSafeDoubleCheck {
            if(instance2 == null){
                synchronized(this){
                    if(instance2 == null)
                        instance2 = LazyThreadSafeDoubleCheck()
                }
            }
            return instance2!!
        }
    }
}