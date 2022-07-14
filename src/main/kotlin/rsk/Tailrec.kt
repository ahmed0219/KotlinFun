package rsk

import java.math.BigInteger

fun main(args:Array<String>)
{
    println(fib (10,BigInteger("1"),BigInteger("0")))
}
tailrec fun fib(n:Int,a:BigInteger,b:BigInteger):BigInteger {
    return if (n == 0) b else fib(n - 1, a + b, a)

}
//when we have a ggo number we use tailrec to avoid th stack flow and the function become a loop internally