package patrones.mediator

class ConcreteMediator : IMediator {

    private val colleagueList = mutableListOf<Colleague>()

    override fun register(colleague: Colleague) {
        if(!colleagueList.contains(colleague)){
            colleagueList.add(colleague)
            colleague.mediator = this
        }
    }

    override fun relay(colleague: Colleague) {
        colleagueList.forEach {
            if(it == colleague){
               it.receive()
            }
        }
    }
}