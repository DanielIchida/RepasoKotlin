package patrones.mediator

//TODO is used to reduce communication complexity between multiple objects or classes.
interface IMediator {
    fun register(colleague: Colleague)
    fun relay(colleague: Colleague)
}