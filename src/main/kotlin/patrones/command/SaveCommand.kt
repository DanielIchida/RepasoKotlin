package patrones.command

import java.io.IOException
import java.io.OutputStream
import java.io.OutputStreamWriter

class SaveCommand : FileCommand {
    override fun execute(context: String, fileName: String, vararg arguments: String) {
        try {
            val outputStreamWriter = OutputStreamWriter(OutputStream.nullOutputStream(),fileName)
            outputStreamWriter.write(arguments.toString())
            outputStreamWriter.close()
        }catch (ex: IOException){
            println("IOException: [${ex.message}]")
        }
    }
}