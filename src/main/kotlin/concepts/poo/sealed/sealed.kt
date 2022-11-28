package concepts.poo.sealed

/*
Sealed classes and interfaces represent restricted class hierarchies that provide more control over inheritance.
All direct subclasses of a sealed class are known at compile time
 */
sealed class Persistence
object File : Persistence()
object DataSource : Persistence()
sealed interface Error

sealed class IOError(): Error

class FileReadError(val file: File): IOError()
class DatabaseError(val source: DataSource): IOError()

object RuntimeError : Error

sealed class Post
{
    class Status(var text: String) : Post()
    class Image(var url: String, var caption: String) : Post()
    class Video(var url: String, var timeDuration: Int, var encoding: String): Post()
}

sealed class Shape{
    class Circle(var radius: Float): Shape()
    class Square(var length: Int): Shape()
    object Rectangle: Shape()
    {
        var length: Int = 0
        var breadth : Int = 0
    }
}