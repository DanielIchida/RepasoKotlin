package clean.uses_cases.ports.output

import clean.entities.MyModel

interface MyRepository {
    fun getModelPersistence() : MyModel
}