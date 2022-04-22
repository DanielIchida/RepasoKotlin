package patrones.strategy

//TODO In Strategy pattern, we create objects which represent various strategies and a context object whose behavior varies as per its strategy object. The strategy object changes the executing algorithm of the context object.
interface Strategy {
    fun tokenGenerate(name: String,amount: Int,usersInit: Int) : String
}