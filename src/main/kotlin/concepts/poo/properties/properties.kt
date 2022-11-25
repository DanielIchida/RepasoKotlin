package concepts.poo.properties

//Definition properties
class Address {
    var name: String = "Holmes, Sherlock"
    var street: String = "Baker"
    var city: String = "London"
    var state: String? = null
    var zip: String = "123456"
}

//Copy objects properties
fun copyAddress(address: Address): Address {
    val result = Address()
    result.name = address.name
    result.street = address.street
    return result
}

//Get value
class Rectangle(val width: Int, val height: Int) {
    val area: Int // property type is optional since it can be inferred from the getter's return type
        get() = this.width * this.height
}

//Lateinit declared as having a non-null type must be initialized in the constructor
lateinit var subject: String
