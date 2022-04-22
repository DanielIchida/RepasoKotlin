package patrones.adapter

data class UserResponse(
    val id: String,
    val name: String,
    val token: String,
    val userPhotoUrl: String,
    val tokenTransfer: String
)