package net.println.kt15

/**
 * Created by luliju on 2017/7/19.
 */
fun main(args:Array<String>){
//    val worker = Executors.newCachedThreadPool()
//    worker.execute(){
//        println("Hello")
//    }
    val  samInJava = SAMInJava()
    var lambda = {
        println("Hello")
    }
    samInJava.addTask(lambda)
    samInJava.addTask(lambda)
    samInJava.addTask(lambda)
    samInJava.addTask(lambda)
    samInJava.addTask(lambda)
    samInJava.removeTask(lambda)
    samInJava.removeTask(lambda)
    samInJava.removeTask(lambda)
    samInJava.removeTask(lambda)
    samInJava.removeTask(lambda)
}