package hexagonal.uses_cases.port.primary

import hexagonal.model.MyModel

interface MyService {
    fun retrieveModel() : MyModel
}