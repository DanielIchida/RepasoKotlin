package concepts.poo.inline

/*
Sometimes it is necessary for business logic to create a wrapper around some type. However,
it introduces runtime overhead due to additional heap allocations.
 */
fun main(args: Array<String>) {
    val securePassword = Password("Don't try this in production")

    val name = Name("Kotlin")
    name.greet() // method `greet` is called as a static method
    println(name.length) // property getter is called as a static method
}

@JvmInline
value class Password(private val s: String)

@JvmInline
value class Name(val s: String) {
    init {
        require(s.isNotEmpty()) { }
    }

    val length: Int
        get() = s.length

    fun greet() {
        println("Hello, $s")
    }
}

interface Printable {
    fun prettyPrint(): String
}

@JvmInline
value class NameTwo(val s: String) : Printable {
    override fun prettyPrint(): String = "Let's $s!"
}




