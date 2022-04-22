package patrones.mediator

class ColleagueOne(mediator: IMediator) : Colleague(mediator) {
    override fun receive() {
        println("Colleague 1 receive request")
    }

    override fun send() {
        println("Colleague 1 do one request")
        mediator.relay(this)
    }
}