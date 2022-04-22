package onion.controllers

import onion.services.MyService

class RestController {

    private var service: MyService = MyService()

    private var convertDto: MyModelToConvertDto = MyModelToConvertDto()

    fun get() : ModelDto{
        val model = service.retrieveModel()
        return convertDto.convert(model)
    }


}