package concepts

fun main(args: Array<String>) {
    val a: Int? = try { "Daniel".toInt() } catch (e: NumberFormatException){ null }
    val s = "Daniel" ?: throw IllegalArgumentException("name required")
    val s1 = "Pepe" ?: fail("Name required")

}

fun fail(msg: String) : Nothing{
    throw IllegalArgumentException(msg)
}