package hexagonal.adapters.secondary

import hexagonal.model.MyModel


class ModelPersistenceToModelBuilder {

    fun buildFromPersistence(persistence: ModelPersistence) : MyModel {
        return MyModel(persistence.id,persistence.name)
    }

}