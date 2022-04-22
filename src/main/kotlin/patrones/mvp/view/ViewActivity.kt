package patrones.mvp.view

import patrones.mvp.HomeContract
import patrones.mvp.model.Users
import patrones.mvp.presenter.HomePresenter

class ViewActivity : HomeContract.View {

    private var presenter: HomePresenter = HomePresenter(this)

    init {
        presenter.getUsers()
    }

    override fun showLoader() {
        println("Loading..")
    }

    override fun hideLoader() {
        println("Hide..")
    }

    override fun showUsers(users: List<Users>) {
        users.forEach { it ->
            println("user: [name: ${it.name} - lastname ${it.lastname}] - age ${it.age}")
        }
    }

}