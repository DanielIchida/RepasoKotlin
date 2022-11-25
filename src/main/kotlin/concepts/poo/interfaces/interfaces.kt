package concepts.poo.interfaces

//Implementation
interface MyInterface {
    fun bar()
    fun foo() {
        // optional body
    }
}
class Child : MyInterface {
    override fun bar() {
        // body
    }
}

//Properties
interface MyInterfaceTwo {
    val prop: Int // abstract

    val propertyWithImplementation: String
        get() = "foo"

    fun foo() {
        print(prop)
    }
}

class ChildTwo : MyInterfaceTwo{
    override val prop: Int = 29
}

//Inheritance
interface Named {
    val name: String
}

interface Person : Named {
    val firstName: String
    val lastName: String
    override val name: String get() = "$firstName $lastName"
}

data class Employee(
    override val firstName: String,
    override val lastName: String,
    val position: String
) : Person