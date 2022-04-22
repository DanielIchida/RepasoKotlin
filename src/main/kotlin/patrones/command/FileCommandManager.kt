package patrones.command

import java.lang.RuntimeException

//TODO this is a pattern that separate actions that it can be executed from several points. small commands
class FileCommandManager {

    private val commands: HashMap<String,FileCommand> = HashMap()

    fun putCommand(commandName: String,fileCommand: FileCommand){
        commands[commandName] = fileCommand
    }

    fun getCommand(commandName: String) : FileCommand{
        if(commands.containsKey(commandName))
            return commands[commandName] as FileCommand
        else
            throw RuntimeException("command $commandName is not register")
    }

}