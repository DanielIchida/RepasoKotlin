package patrones.strategy

class Cardano : Strategy {
    override fun tokenGenerate(name: String, amount: Int, usersInit: Int) : String {
        return "CARDANO:[Token: $name - Amount: $amount - users: $usersInit]"
    }
}