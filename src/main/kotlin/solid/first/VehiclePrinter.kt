package solid.first

class VehiclePrinter {

    fun print(vehicle: Vehicle){
        println("wheelCount=${vehicle.wheelCount} maxSpeed=${vehicle.maxSpeed}")
    }

}

data class Vehicle(
    var wheelCount: Int,
    var maxSpeed: Int
)