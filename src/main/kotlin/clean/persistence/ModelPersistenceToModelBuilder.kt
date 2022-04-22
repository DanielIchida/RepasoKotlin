package clean.persistence

import clean.entities.MyModel


class ModelPersistenceToModelBuilder {

    fun buildFromPersistence(persistence: ModelPersistence) : MyModel {
        return MyModel(persistence.id,persistence.name)
    }

}