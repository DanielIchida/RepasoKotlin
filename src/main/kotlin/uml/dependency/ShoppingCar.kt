package uml.dependency

class ShoppingCar(private val pay: Pay) {

    fun finishPay(){
        pay.buy()
    }

}