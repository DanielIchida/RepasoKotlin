package patrones.observer

//TODO this is a pattern that help us for subscribe events of the class and it get notification
interface Observable<T>{
    fun addObserver(observer: Observer<T>)
    fun removeObserver(observer: Observer<T>)
    fun notifyObserver(newValue: T)
}