package patrones.mvp

import patrones.mvp.model.Users

interface HomeContract {

    interface View{
         fun showLoader()
         fun hideLoader()
         fun showUsers(users: List<Users>)
    }

    interface Presenter{
        fun getUsers()
    }

    interface OnResponseCallback{
        fun onResponse(users: List<Users>)
    }

}