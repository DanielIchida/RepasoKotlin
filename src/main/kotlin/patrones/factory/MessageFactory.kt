package patrones.factory

//TODO this is a pattern that helps us to create instances given a type
class MessageFactory {

    fun getDialog(type: MessageEnum) : Message{
        val message: Message = when(type){
            MessageEnum.SUCCESS -> {
                SuccessMessage()
            }
            MessageEnum.ERROR -> {
                ErrorMessage()
            }
            MessageEnum.WARNING -> {
                WarningMessage()
            }
        }
        return message
    }

}