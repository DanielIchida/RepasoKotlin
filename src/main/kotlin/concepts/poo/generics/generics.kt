package concepts.poo.generics

class Box<T>(t: T) {
    var value = t
}

interface Source<out T> {
    fun nextT(): T
}

interface Comparable<in T> {
    operator fun compareTo(other: T): Int
}

fun handleStrings(list: MutableList<String>) {
    if (list is ArrayList) {

    }
}

fun main(args: Array<String>) {

}