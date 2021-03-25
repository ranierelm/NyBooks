package com.ranierelm.nybooks.presentation.books


import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ranierelm.nybooks.data.model.Book

class BooksViewModel : ViewModel(){

    val booksLiveData: MutableLiveData<List<Book>> = MutableLiveData()

    fun getBooks(){
        booksLiveData.value = createFakeBooks()
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