package concepts.functions

val a = { i: Int -> i + 1 }

fun main(args: Array<String>) {
    println(stringPlus.invoke("<-", "->"))
    println(stringPlus("Hello, ", "world!"))
    println(intPlus.invoke(1, 1))
    println(intPlus(1, 2))

    html {
        body()
    }
}

val stringPlus: (String, String) -> String = String::plus
val intPlus: Int.(Int) -> Int = Int::plus

fun compare(a: String, b: String): Boolean = a.length < b.length
val sum: (Int, Int) -> Int = { x: Int, y: Int -> x + y }

class HTML {
    fun body() {}
}

fun html(init: HTML.() -> Unit): HTML {
    val html = HTML()  // create the receiver object
    html.init()        // pass the receiver object to the lambda
    return html
}
