package com.example.moviesapp09_01_23.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.moviesapp09_01_23.R
import com.example.moviesapp09_01_23.models.MovieData

class MovieAdapter(var lista: MutableList<MovieData>,
var onItemClick: (MovieData) -> Unit): RecyclerView.Adapter<MovieViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.layout_movie, parent, false)
        return MovieViewHolder(v)
    }

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.render(lista[position], onItemClick)
    }

    override fun getItemCount(): Int {
        return lista.size
    }
}