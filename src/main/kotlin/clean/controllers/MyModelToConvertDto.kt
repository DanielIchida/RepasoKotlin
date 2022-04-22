package clean.controllers

import clean.entities.MyModel


class MyModelToConvertDto {

    fun convert(model: MyModel) : ModelDto{
        return ModelDto(model.id,model.name)
    }

}