package hexagonal.services

import hexagonal.model.MyModel
import hexagonal.uses_cases.port.primary.MyService
import hexagonal.uses_cases.port.secondary.MyRepository

class MyServiceImpl : MyService {

    private lateinit var repository: MyRepository

    override fun retrieveModel(): MyModel {
        return repository.getModelPersistence()
    }
}