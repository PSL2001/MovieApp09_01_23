package com.example.moviesapp09_01_23

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.moviesapp09_01_23.databinding.ActivityDetallesBinding
import com.example.moviesapp09_01_23.models.MovieData
import com.squareup.picasso.Picasso

class DetallesActivity : AppCompatActivity() {
    lateinit var binding: ActivityDetallesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetallesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        cogerDatos()
    }

    private fun cogerDatos() {
        val datos = intent.extras
        val movie = datos?.getSerializable("MOVIE") as MovieData
        Picasso.get().load("https://image.tmdb.org/t/p/w500${movie.poster}").into(binding.ivPoster)
        binding.tvTitulo2.text = movie.titulo
        binding.tvSinopsis2.text = movie.overview
    }
}