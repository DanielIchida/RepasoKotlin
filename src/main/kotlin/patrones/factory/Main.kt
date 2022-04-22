package patrones.factory

fun main(args: Array<String>){

    val factory = MessageFactory()
    val ok = factory.getDialog(MessageEnum.SUCCESS)
    ok.draw("Data Success")

}