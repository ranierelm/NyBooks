package com.ranierelm.nybooks.presentation.books


import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ranierelm.nybooks.data.ApiService
import com.ranierelm.nybooks.data.model.Book
import com.ranierelm.nybooks.data.response.BookBodyResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class BooksViewModel : ViewModel(){

    val booksLiveData: MutableLiveData<List<Book>> = MutableLiveData()

    fun getBooks(){
        //booksLiveData.value = createFakeBooks()
        ApiService.service.getBooks().enqueue(object: Callback<BookBodyResponse>{
            override fun onResponse(
                call: Call<BookBodyResponse>,
                response: Response<BookBodyResponse>
            ) {
                TODO("Not yet implemented")
            }

            override fun onFailure(call: Call<BookBodyResponse>, t: Throwable) {
                TODO("Not yet implemented")
            }

        })

    }

    //Dados criados para testar a chamada ao adapter
    fun createFakeBooks(): List<Book>{
        return listOf<Book>(
            Book("Title1", "Author 1"),
            Book("Title2", "Author 2"),
            Book("Title3", "Author 3")
        )
    }
}