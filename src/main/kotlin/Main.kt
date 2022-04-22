import patrones.builder.Car

fun main(args: Array<String>) {

    //nullables
    val listWithNull: List<String?> = listOf("Kotlin",null)
    for (item in listWithNull){
        item?.let { println(it) }
    }

    //elvis operator
    val b: String? = null
    val l = b?.length ?: -1
    println("$l")

}

