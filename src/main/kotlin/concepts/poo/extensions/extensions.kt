package concepts.poo.extensions

fun MutableList<Int>.swap(index1: Int, index2: Int) {
    val tmp = this[index1] // 'this' corresponds to the list
    this[index1] = this[index2]
    this[index2] = tmp
}

fun main(args: Array<String>) {
    val list = mutableListOf(1, 2, 3)
    list.swap(0, 2)
    Example().printFunctionType()
}


class Example {
    fun printFunctionType() { println("Class method") }
}
fun Example.printFunctionType() { println("Extension function") }

val <T> List<T>.lastIndex: Int
    get() = size - 1

