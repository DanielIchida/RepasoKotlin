package hexagonal.adapters.primary

import hexagonal.model.MyModel


class MyModelToConvertDto {

    fun convert(model: MyModel) : ModelDto{
        return ModelDto(model.id,model.name)
    }

}