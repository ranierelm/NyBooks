package com.ranierelm.nybooks.presentation.books

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.ranierelm.nybooks.R
import com.ranierelm.nybooks.data.model.Book
import com.ranierelm.nybooks.databinding.ActivityBooksBinding

class BooksActivity : AppCompatActivity() {

    private lateinit var binding: ActivityBooksBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBooksBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Configuração Toolbar
        binding.toolbarMain.title = getString(R.string.books_title)
        setSupportActionBar(binding.toolbarMain)

        //
        with(binding.recyclerBooks){
            layoutManager = LinearLayoutManager(this@BooksActivity, RecyclerView.VERTICAL, false)
            setHasFixedSize(true)
            adapter = BooksAdapter(getBooks())
        }

        val viewModel: BooksViewModel = ViewModelProvider(this).get(BooksViewModel::class.java)

    }

    //Dados criados para testar a chamada ao adapter
    fun getBooks(): List<Book>{
        return listOf<Book>(
                Book("Title1", "Author 1"),
                Book("Title2", "Author 2"),
                Book("Title3", "Author 3")
        )
    }
}