fun main(args: Array<String>) {
   html {
       body()
   }
}

val sum: (Int,Int) -> Int = {x: Int,y: Int -> x + y}
fun compare(a: String,b: String): Boolean = a.length > b.length

class Html{
    fun body(){ println("Body") }

}

fun html(init: Html.() -> Unit) : Html{
    val html = Html()
    html.init()
    return html
}