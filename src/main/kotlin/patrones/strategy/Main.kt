package patrones.strategy

fun main(args: Array<String>) {
    val context = Context(Ethereum())
    println(context.executeStrategy("CRO",10000,1000))
}