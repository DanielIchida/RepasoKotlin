package patrones.command

class View {

    private lateinit var commandManager: FileCommandManager

    fun onCreate(){
        commandManager = FileCommandManager()
        commandManager.putCommand(TypeCommand.SAVE.toString(),SaveCommand())
        commandManager.putCommand(TypeCommand.READ.toString(),ReadCommand())
    }

    fun getCommandSave(){
        commandManager.getCommand(TypeCommand.SAVE.toString()).execute("view","daniel","pes","2021")
    }
}