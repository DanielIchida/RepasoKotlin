package clean.uses_cases.interactors

import clean.entities.MyModel
import clean.uses_cases.ports.input.MyService
import clean.uses_cases.ports.output.MyRepository

class MyServicesImpl : MyService {

    private lateinit var repository: MyRepository

    override fun retrieveModel(): MyModel {
        return repository.getModelPersistence()
    }
}