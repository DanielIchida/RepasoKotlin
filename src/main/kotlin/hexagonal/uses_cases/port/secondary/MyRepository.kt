package hexagonal.uses_cases.port.secondary

import hexagonal.model.MyModel

interface MyRepository {
    fun getModelPersistence(): MyModel
}