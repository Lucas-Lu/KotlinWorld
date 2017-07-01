package net.println.kt06

/**
 * Created by luliju on 2017/7/1.
 */

enum class Lang(val hello:String){
    ENGLISH("Hello"),
    CHINESE("你好"),
    JAPANESE("konijiwa"),
    KOREAN("23333");

    fun sayHello(){
        println(hello)
    }

    companion object{
        fun parse(lan : String) : Lang{
            return Lang.valueOf(lan.toUpperCase())
        }
    }
}
fun main(args: Array<String>){
    if(args.size == 0)return
    val lang = Lang.parse(args[0])
    print(lang)
    lang.sayHello()
    lang.sayBye()
}
fun Lang.sayBye() {
    var byeStr = when(this){
        Lang.CHINESE -> "再见"
        Lang.ENGLISH -> "Bye"
        Lang.JAPANESE -> "213"
        Lang.KOREAN -> "KO"
    }
    println(byeStr)
}