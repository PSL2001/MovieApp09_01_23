package com.example.moviesapp09_01_23.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.moviesapp09_01_23.databinding.LayoutMovieBinding
import com.example.moviesapp09_01_23.models.MovieData
import com.squareup.picasso.Picasso

class MovieViewHolder(v: View): RecyclerView.ViewHolder(v) {
    private val binding = LayoutMovieBinding.bind(v)

    fun render(movie: MovieData) {
        binding.tvTitulo.text = movie.titulo
        //Picasso.get().load(url).into(campoBinding)
        Picasso.get().load("https://image.tmdb.org/t/p/w300${movie.caratula}").into(binding.ivPeli1)
    }

}
