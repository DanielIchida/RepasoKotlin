package concepts.poo.inheritance

//open keyword to make a clas inheritance
open class Base(p: Int)

class Derived(p: Int) : Base(p)

open class Shape(){
    open val vertexCount = 0;
    open fun draw(){}
    fun fill(){}
}

class Circle : Shape(){
    override val vertexCount: Int = 5
    override fun draw() {
        super.draw()
    }
}

open class Rectangle : Shape(){
    open override fun draw() {
        println("Drawing a rectangle")
    }
    val borderColor: String get() = "black"
}

//Calling the superclass implementation
class FillRectangle : Rectangle(){
    override fun draw() {
        super.draw()
        println("Filling the rectangle")
    }
    val fillColor: String get() = super.borderColor
}

//Override Rules
interface Polygon {
    fun draw() { /* ... */ }
}

class Square() : Rectangle() , Polygon{
    override fun draw() {
        super<Rectangle>.draw()
        super<Polygon>.draw()
    }
}
