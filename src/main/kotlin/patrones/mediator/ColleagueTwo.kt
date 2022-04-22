package patrones.mediator

class ColleagueTwo(mediator: IMediator) : Colleague(mediator) {
    override fun receive() {
        println("Colleague 2 receive request")
    }

    override fun send() {
        println("Colleague 2 do one request")
        mediator.relay(this)
    }
}