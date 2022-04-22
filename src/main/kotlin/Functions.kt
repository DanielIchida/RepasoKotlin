fun main(args: Array<String>) {
    val result = double(2)
    println(result)

    val list = asList(1,2,3)

    println(1.shl(2))
}

//simple
fun double(x: Int): Int{
    return x * 2
}

//multiples params
fun <T> asList(vararg ts: T) : List<T>{
    val result = ArrayList<T>()
    for (t in ts)
        result.add(t)
    return result
}

//just one param functions infix
infix fun Int.shl(x: Int){
   this.plus(10) * this.plus(x)
}

//tail recursive functions
val eps = 1E-10
tailrec fun findFixPoint(x: Double = 1.0) : Double =
    if(Math.abs(x - Math.cos(x)) < eps) x else findFixPoint(Math.cos(x))


