package solid.four

import java.util.*

interface Product {
    val name: Product
    val stock: Int
    val numberOfDisk: Int
    val releaseDate: Date
}

interface AgeAware{
    val recommendAge: Int
}

abstract class CD : Product
abstract class DVD : Product,AgeAware

data class User(val age: Int)

fun checkUserCanBuy(user: User,ageAware: AgeAware) =
    user.age >= ageAware.recommendAge