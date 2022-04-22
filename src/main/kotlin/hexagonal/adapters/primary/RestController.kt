package hexagonal.adapters.primary

import hexagonal.services.MyServiceImpl
import hexagonal.uses_cases.port.primary.MyService

class RestController {

    private var service: MyService = MyServiceImpl()

    private var convertDto: MyModelToConvertDto = MyModelToConvertDto()

    fun get() : ModelDto{
        val model = service.retrieveModel()
        return convertDto.convert(model)
    }


}