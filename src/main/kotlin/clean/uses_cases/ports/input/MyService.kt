package clean.uses_cases.ports.input

import clean.entities.MyModel

interface MyService {
    fun retrieveModel() : MyModel
}