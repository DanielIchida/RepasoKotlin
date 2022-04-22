package hexagonal.adapters.secondary

import hexagonal.model.MyModel
import hexagonal.uses_cases.port.secondary.MyRepository


class MyRepositoryImpl : MyRepository {

    override fun getModelPersistence(): MyModel {
        val modelPersistenceBuilder = ModelPersistenceToModelBuilder()
        val modelPersistence = ModelPersistence(0,"");
        return modelPersistenceBuilder.buildFromPersistence(modelPersistence)
    }
}