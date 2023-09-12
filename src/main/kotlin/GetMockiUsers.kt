import retrofit2.Retrofit
import retrofit2.converter.jackson.JacksonConverterFactory

object GetMockiUsers {
    val retrofit: InterfaceMockApi = Retrofit.Builder()
        .baseUrl("https://64fa51d9cb9c00518f79e0ac.mockapi.io/")
        .addConverterFactory(JacksonConverterFactory.create())
        .build()
        .create(InterfaceMockApi::class.java)
}