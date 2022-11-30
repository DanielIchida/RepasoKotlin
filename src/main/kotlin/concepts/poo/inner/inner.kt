package concepts.poo.inner

fun main(args: Array<String>) {
    val demo = Outer().Inner().foo()
}

class Outer {
    private val bar: Int = 1
    inner class Inner {
        fun foo() = bar
    }
}