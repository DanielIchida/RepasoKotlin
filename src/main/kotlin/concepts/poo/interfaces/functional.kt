package concepts.poo.interfaces

//Declare var how object lambda
fun interface IntPredicate {
    fun accept(i: Int): Boolean
}

val isEven = IntPredicate { i -> i % 2 == 0 }

//typeAlias
typealias ageMore = (i: Int) -> Boolean

val isMore: ageMore = { it >= 18 }

fun main() {
    println("Is 7 even? - ${isEven.accept(7)}")
    println("Is More? - ${isMore(20)}")
}

