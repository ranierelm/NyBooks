package com.ranierelm.nybooks.data

import com.ranierelm.nybooks.data.response.BookBodyResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface NYTServices {

    @GET("lists.json")
    fun getBooks(
        @Query("api-key") apiKey: String = "2dayBXyC9PeNfk9o4VeSjSOly0xB0Sp5",
        @Query("list") list: String = "hardcover-fiction"
    ): Call<BookBodyResponse>
}