package patrones.mvp.interactor

import patrones.mvp.HomeContract
import patrones.mvp.model.Users

//TODO SE ENCARGA DE LA COMUNICACION DE LA CAPA DE DATOS
class HomeInteractor {

     fun findAllUserCache(responseCallback: HomeContract.OnResponseCallback){
         val users = mutableListOf<Users>()
         users.add(Users("Daniel","Chia",27))
         users.add(Users("Daniel","Chia",27))
         users.add(Users("Daniel","Chia",27))
         responseCallback.onResponse(users)
     }

}