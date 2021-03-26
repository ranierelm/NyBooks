package com.ranierelm.nybooks.data.response

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

//processador de anotação(moshi-kapt)
@JsonClass(generateAdapter = true)

data class BookBodyResponse(
    @Json(name = "results")
    val bookResults: List<BookResultsResponse>
)