package patrones.adapter

fun main(args: Array<String>){
    val userResponse = UserResponse("1","Daniel","XCV","image.png","XCV")
    val adapter = UserAdapter()
    val model = adapter.getUserModel(userResponse)
    println("Name: [${model.userName}] - Img: [${model.photoUrl}]")

}