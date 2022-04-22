package patrones.strategy

class Polkadot : Strategy {
    override fun tokenGenerate(name: String, amount: Int, usersInit: Int) : String {
        return "POLKADOT:[Token: $name - Amount: $amount - users: $usersInit]"
    }
}