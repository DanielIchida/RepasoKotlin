package onion.persistence

import onion.model.MyModel

class ModelPersistenceToModelBuilder {

    fun buildFromPersistence(persistence: ModelPersistence) : MyModel{
        return MyModel(persistence.id,persistence.name)
    }

}