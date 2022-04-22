package patrones.strategy

class Ethereum : Strategy {

    override fun tokenGenerate(name: String, amount: Int, usersInit: Int) : String {
        return "ETHEREUM:[Token: $name - Amount: $amount - users: $usersInit]"
    }
}