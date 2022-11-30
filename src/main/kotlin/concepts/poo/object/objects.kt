package concepts.poo.`object`

val helloWorld = object {
    val hello = "Hello"
    val world = "World"
    override fun toString() = "$hello $world"
}

fun main(args: Array<String>) {
    val instance = MyClass.create()
}

class MyClass {
    companion object Factory {
        fun create(): MyClass = MyClass()
    }
}