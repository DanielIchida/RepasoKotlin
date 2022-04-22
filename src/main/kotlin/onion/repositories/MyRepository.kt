package onion.repositories

import onion.model.MyModel

interface MyRepository {
    fun getModelPersistence() : MyModel
}