package solid.five

class Shopping

class ShoppingBasket(
    private val persistence: Persistence,
    private val paymentMethod: PaymentMethod
){
    fun buy(shopping: Shopping){
        persistence.save(shopping)
        paymentMethod.pay(shopping)
    }

}

interface Persistence{
    fun save(shopping: Shopping)
}

interface PaymentMethod{
    fun pay(shopping: Shopping)
}

class SqlDatabase : Persistence{
    override fun save(shopping: Shopping) {
        TODO("Not yet implemented")
    }
}

class Server: Persistence{
    override fun save(shopping: Shopping) {
        TODO("Not yet implemented")
    }

}

class CreditCard : PaymentMethod{
    override fun pay(shopping: Shopping) {
        TODO("Not yet implemented")
    }
}

class Paypal: PaymentMethod{
    override fun pay(shopping: Shopping) {
        TODO("Not yet implemented")
    }

}

fun main() {
    val sb = ShoppingBasket(Server(),Paypal())
    sb.buy(Shopping())
}