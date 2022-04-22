package patrones.observer

class View{

    private var value: Double = 0.0
    private var balanceObservable: BalanceObservable = BalanceObservable()

    init {
        balanceObservable.addObserver(object : Observer<Double>{
            override fun notifyChange(newValue: Double) {
                value = newValue
            }
        })
    }

    fun onEventAmount(newValue: Double){
        balanceObservable.changeAmount(newValue)
    }


}