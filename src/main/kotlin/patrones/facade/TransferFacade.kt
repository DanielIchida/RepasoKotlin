package patrones.facade

//TODO this is a class that encapsulates complexity of various subsystems in more simples
class TransferFacade {

    val analitycsManager = AnalitycsManager()
    val securityManager = SecurityManager()
    val transferManager = TransferManager()

    fun transfer(){
        val token = securityManager.getToken()
        analitycsManager.registerTransfer(token)
        transferManager.transfer(token)
    }

}