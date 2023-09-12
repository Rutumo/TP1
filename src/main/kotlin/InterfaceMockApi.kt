import retrofit2.Call
import retrofit2.http.GET

interface InterfaceMockApi {
    @GET("users")
    fun getUserData(): Call<List<Users>>
}