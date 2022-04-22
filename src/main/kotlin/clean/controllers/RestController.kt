package clean.controllers

import clean.uses_cases.interactors.MyServicesImpl
import clean.uses_cases.ports.input.MyService

class RestController {

    private var service: MyService = MyServicesImpl()

    private var convertDto: MyModelToConvertDto = MyModelToConvertDto()

    fun get() : ModelDto{
        val model = service.retrieveModel()
        return convertDto.convert(model)
    }


}