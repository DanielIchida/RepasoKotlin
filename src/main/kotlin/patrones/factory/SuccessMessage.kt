package patrones.factory

class SuccessMessage : Message {
    override fun draw(msg: String) {
        println("SUCCESS: [$msg]")
    }
}