package patrones.command

import java.io.BufferedReader
import java.io.InputStream
import java.io.InputStreamReader

class ReadCommand : FileCommand {
    override fun execute(context: String, fileName: String, vararg arguments: String) {
        var fileString = ""
        val inputStream = InputStream.nullInputStream()
        val stringBuilder = StringBuilder()
        val inputStreamReader = InputStreamReader(inputStream)
        val bufferedReader = BufferedReader(inputStreamReader)
        bufferedReader.forEachLine { stringBuilder.append("\n").append(it) }
        fileString = stringBuilder.toString()
        println("READ FILE: [$fileString]")
    }

}