package patrones.observer

//TODO this is a pattern that help us for subscribe events of the class and it get notification
interface Observer<T>{
    fun notifyChange(newValue: T)
}