package onion.controllers

import onion.model.MyModel

class MyModelToConvertDto {

    fun convert(model: MyModel) : ModelDto{
        return ModelDto(model.id,model.name)
    }

}