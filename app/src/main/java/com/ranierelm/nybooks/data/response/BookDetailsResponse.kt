package com.ranierelm.nybooks.data.response

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BookDetailsResponse(
    @Json(name = "title") // Foi explicitado , mas não é necessário, pois a variavel tem o mesmo nome do valor retornado API
    val title: String,
    @Json(name = "author")
    val author: String,
    @Json(name = "description")
    val description: String
)
