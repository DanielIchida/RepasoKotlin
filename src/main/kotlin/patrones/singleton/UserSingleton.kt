package patrones.singleton

//TODO Singleton pattern is used globally and immutability
class UserSingleton {

    private var instance: UserSingleton? = null

    fun getInstance() : UserSingleton{
        if(instance == null){
            instance = UserSingleton()
        }
        return instance as UserSingleton
    }

}
