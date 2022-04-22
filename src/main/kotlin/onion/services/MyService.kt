package onion.services

import onion.model.MyModel
import onion.repositories.MyRepository

class MyService {

    private lateinit var myRepository: MyRepository

    fun retrieveModel() :  MyModel{
        return myRepository.getModelPersistence();
    }

}