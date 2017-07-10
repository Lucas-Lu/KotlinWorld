package net.println.kt11

/**
 * Created by luliju on 2017/7/10.
 */
sealed class PlayerCmd{
    class Play(val url:String,val position: Long = 0):PlayerCmd()

    class Seek(val position: Long):PlayerCmd()

    object Pause:PlayerCmd()

    object Resume:PlayerCmd()

    object Stop:PlayerCmd()
}