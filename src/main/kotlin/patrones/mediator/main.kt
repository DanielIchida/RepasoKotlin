package patrones.mediator

fun main() {
    val mediator = ConcreteMediator()
    val c1 = ColleagueOne(mediator);
    val c2 = ColleagueTwo(mediator);
    mediator.register(c1)
    mediator.register(c2)
    c1.send()
    println(" - -  - -  - ")
    c2.send()
}