package patrones.builder

//TODO helps us to create very complex objects in a simple way, and in addition to avoiding giant constructors
class Car(name: String , brand: String, color: String, displacement: Int){
     class Builder{
        var name = ""
        var brand = ""
        var color = ""
        var displacement = 0

        fun setName(newName: String): Builder{
            this.name = newName
            return this
        }

        fun setBrand(newBrand: String) : Builder{
            this.brand = newBrand
            return this
        }

        fun setColor(newColor: String) : Builder{
            this.color = newColor
            return this
        }

        fun setDisplacement(newDisplacement: Int) : Builder{
            this.displacement = newDisplacement
            return this
        }

        fun build() : Car{
            return Car(name,brand,color,displacement)
        }
    }
}