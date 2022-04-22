package patrones.factory

class WarningMessage : Message {
    override fun draw(msg: String) {
        println("WARNING: [$msg]")
    }
}