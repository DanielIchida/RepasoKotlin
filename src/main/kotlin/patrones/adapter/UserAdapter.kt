package patrones.adapter

//TODO this is a mediator between two class that it's not understands by means of the one class
class UserAdapter(){
    fun getUserModel(userResponse: UserResponse): UserViewModel {
        return UserViewModel(userResponse.name, userResponse.userPhotoUrl)
    }
}