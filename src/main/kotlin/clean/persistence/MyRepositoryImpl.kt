package clean.persistence

import clean.entities.MyModel
import clean.uses_cases.ports.output.MyRepository


class MyRepositoryImpl : MyRepository {

    override fun getModelPersistence(): MyModel {
        val modelPersistenceBuilder = ModelPersistenceToModelBuilder()
        val modelPersistence = ModelPersistence(0,"");
        return modelPersistenceBuilder.buildFromPersistence(modelPersistence)
    }
}