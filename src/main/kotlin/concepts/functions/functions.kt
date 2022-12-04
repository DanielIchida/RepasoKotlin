package concepts.functions

import kotlin.math.abs
import kotlin.math.cos

fun main(args: Array<String>) {
    val list = asList(1, 2, 3)
}

//basic
fun double(x: Int): Int {
    return 2 * x
}

//open class
open class A {
    open fun foo(i: Int = 10) { /*...*/ }
}
class B : A() {
    override fun foo(i: Int) { /*...*/ }  // No default value is allowed.
}

//Unit
fun printHello(name: String?): Unit {
    if (name != null)
        println("Hello $name")
    else
        println("Hi there!")
    // `return Unit` or `return` is optional
}

//vararg
fun <T> asList(vararg ts: T): List<T> {
    val result = ArrayList<T>()
    for (t in ts) // ts is an Array
        result.add(t)
    return result
}

//Recursive
const val eps = 1E-10
tailrec fun findFixPoint(x: Double = 1.0): Double =
    if (abs(x - cos(x)) < eps) x else findFixPoint(cos(x))
