package com.ranierelm.nybooks.data

import com.ranierelm.nybooks.data.response.BookBodyResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface NYTServices {

    @GET("lists.json")
    fun getBooks(
        @Query("api-key") apiKey: String = "83YAKkny4Ssj7t6FxYEoY2vla89O7UOA",
        @Query("list") list: String = "hardcover-fiction"
    ): Call<BookBodyResponse>
}