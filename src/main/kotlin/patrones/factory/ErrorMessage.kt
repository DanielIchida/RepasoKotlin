package patrones.factory

class ErrorMessage  : Message{
    override fun draw(msg: String) {
        println("ERROR: [$msg]")
    }

}