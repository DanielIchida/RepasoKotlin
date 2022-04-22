package solid.third

open class Animal {
    open fun walk(){}
}

open class LigthWeigthAnimal : Animal() {
    open fun jump(){}
}

class Elephant : Animal(){
    override fun walk() {
        super.walk()
    }
}
class Dog: LigthWeigthAnimal() {
    override fun jump() {
        super.jump()
    }
}