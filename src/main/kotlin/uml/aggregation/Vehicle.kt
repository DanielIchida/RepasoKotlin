package uml.aggregation

class Vehicle {

    private lateinit var motor: Motor
    private lateinit var stereo: Stereo

    fun building(motor: Motor,stereo: Stereo){
        this.motor = motor
        this.stereo = stereo
    }

}