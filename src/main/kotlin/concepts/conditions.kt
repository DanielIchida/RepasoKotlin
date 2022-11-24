package concepts

fun main(args: Array<String>) {
    val edad = 20
    val edadMayor = if (edad >= 18) print("Mayor") else println("Menor")

    val opcion = 1
    when(opcion) {
        1 -> println("X")
        2 -> println("Y")
        else -> {
            print("don't exits")
        }
    }

    when(opcion){
        in 1..10 -> print("range")
        !in 10..20 -> println("no range")
        else -> println("no range")
    }

}

fun hasCar(x: Any) = when(x){
    is String -> x.startsWith("car")
    else -> false
}

