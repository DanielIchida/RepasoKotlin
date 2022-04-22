package solid.second

fun main() {
    drawVehicule(Car())
    drawVehicule(MotorBike())
    drawVehicule(Truck())
}

fun drawVehicule(vehicle: Vehicle){
    vehicle.draw()
}