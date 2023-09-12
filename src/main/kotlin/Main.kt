import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

fun main() {

    val retrofitData = GetMockiUsers.retrofit.getUserData()

    retrofitData.enqueue(object : Callback<List<Users>?> {
        override fun onResponse(call: Call<List<Users>?>, reponse: Response<List<Users>?>) {
            val users: List<Users> = reponse.body()!!
            if (reponse.isSuccessful){
                for (user in users){
                    println("User : ${user.id} | name : ${user.name} | email : ${user.email} | password : ${user.password}")
                }
            }
            else {
                println("Essayez de voir la liste des utilisateurs")
            }
        }
        override fun onFailure(call: Call<List<Users>?>, reponse: Throwable) {
            print(reponse.localizedMessage)
        }
    })
}