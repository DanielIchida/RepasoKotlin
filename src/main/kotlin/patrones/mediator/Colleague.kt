package patrones.mediator

abstract class Colleague(var mediator: IMediator){
    abstract fun receive();
    abstract fun send();
}