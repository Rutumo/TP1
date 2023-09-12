import com.fasterxml.jackson.annotation.JsonProperty

data class Users(
    @JsonProperty("_id")
    var id: Int = 0,
    @JsonProperty("name")
    var name: String = "",
    @JsonProperty("email")
    var email: String = "",
    @JsonProperty("password")
    var password: String = ""
)
