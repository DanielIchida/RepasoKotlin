package onion.persistence

import onion.model.MyModel
import onion.repositories.MyRepository

class MyRepositoryImpl : MyRepository {

    override fun getModelPersistence(): MyModel {
        val modelPersistenceBuilder = ModelPersistenceToModelBuilder()
        val modelPersistence = ModelPersistence(0,"");
        return modelPersistenceBuilder.buildFromPersistence(modelPersistence)
    }
}