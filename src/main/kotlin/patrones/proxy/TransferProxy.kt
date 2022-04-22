package patrones.proxy

//TODO this is a element that it's have a level of security between two class
class TransferProxy {

    val MAX_TRANSFER_AMOUNT = 1000000
    val MIN_TRANSFER_AMOUNT = 100

    fun checkTransfer(amount: Double) : String{
        return when{
            amount > MAX_TRANSFER_AMOUNT -> {
                "The transaction is exceeds amount"
            }
            amount < MIN_TRANSFER_AMOUNT -> {
                "the transaction have to more than $MIN_TRANSFER_AMOUNT"
            }
            else -> {
                "the transaction was make correct"
            }
        }
    }

    fun doTransfer(amount: Double){

    }
}