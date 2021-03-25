package com.ranierelm.nybooks.presentation.books

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ranierelm.nybooks.R

class BooksAdapter : RecyclerView.Adapter<BooksAdapter.BooksViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BooksViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_book, parent, false)

        return BooksViewHolder(view)

    }

    override fun onBindViewHolder(holder: BooksViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {

    }

    class BooksViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    }

}