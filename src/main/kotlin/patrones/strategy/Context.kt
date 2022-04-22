package patrones.strategy

class Context(var strategy: Strategy){

    fun executeStrategy(name: String,amount: Int,usersInit: Int) : String{
        return strategy.tokenGenerate(name,amount,usersInit)
    }

}