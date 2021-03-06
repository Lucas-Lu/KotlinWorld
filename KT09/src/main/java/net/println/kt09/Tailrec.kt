package net.println.kt09

import java.math.BigInteger

/**
 * Created by luliju on 2017/7/6.
 */
class Result(var value: BigInteger = BigInteger.valueOf(1L))


tailrec fun factorial(num: Int, result: Result){
    if(num == 0) result.value = result.value.times(BigInteger.valueOf(1L))
    else {
        result.value = result.value.times(BigInteger.valueOf(num.toLong()))
        factorial(num - 1, result)
    }
}

fun main(args: Array<String>) {
    val result = Result()
    factorial(10000, result)
    println(result.value)
}