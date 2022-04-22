package patrones.mvp.presenter

import patrones.mvp.HomeContract
import patrones.mvp.interactor.HomeInteractor
import patrones.mvp.model.Users

//TODO SE ENCARGA DE LA COMUNICION CON LA VISTA
class HomePresenter(private val view: HomeContract.View) : HomeContract.Presenter{

    private val homeInteract = HomeInteractor()

    override fun getUsers(){
        view.showLoader()
        homeInteract.findAllUserCache(object : HomeContract.OnResponseCallback{
            override fun onResponse(users: List<Users>) {
                view.hideLoader()
                view.showUsers(users)
            }
        })
    }


}