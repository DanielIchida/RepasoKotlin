package patrones.command

//TODO this is a pattern that separate actions that it can be executed from several points. small commands
interface FileCommand {
    fun execute(context: String,fileName: String, vararg arguments: String)
}