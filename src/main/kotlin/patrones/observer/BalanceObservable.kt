package patrones.observer

class BalanceObservable : Observable<Double> {

    private val amountObserverList = mutableListOf<Observer<Double>>()
    private var amount: Double = 0.0

    fun changeAmount(newValue: Double){
        amount = newValue
        notifyObserver(amount)
    }

    override fun addObserver(observer: Observer<Double>) {
        amountObserverList.add(observer)
    }

    override fun removeObserver(observer: Observer<Double>) {
        amountObserverList.remove(observer)
    }

    override fun notifyObserver(newValue: Double) {
        amountObserverList.forEach { it ->
            it.notifyChange(newValue)
        }
    }
}