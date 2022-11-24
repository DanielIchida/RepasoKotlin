package concepts

fun main(args: Array<String>) {

    for(i in 1..3){
        print(i)
    }
    println()
    for(i in 6 downTo 0 step 2){
        print(i)
    }
    println()
    //return break continue

    val name = "daniel"

    val s = name ?: return

    loop@ for(i in 1..100){
        for(j in 1..100){
            if(j == 10) break@loop
        }
    }

}

//return normal
fun foo(){
    listOf(4,5,6,7,8).forEach {
        if(it == 3) return
        print(it)
    }
    println("return")
}

//return omit value
fun foo2(){
    listOf(4,5,6,7,8).forEach lit@{
        if(it == 3) return@lit
        print(it)
    }
    println("return")
}