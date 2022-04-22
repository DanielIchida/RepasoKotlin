package patrones.builder

fun main(args: Array<String>){
    //BUILDER PATTERN
    val car = Car.Builder()
        .setName("Daniel")
        .build()

    println("Car: [${car}]")

    val product = Product()
    product.apply {
        name = "Pan"
        price = 2000.0
        stock = 3
    }
}