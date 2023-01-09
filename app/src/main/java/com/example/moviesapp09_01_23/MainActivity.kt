package com.example.moviesapp09_01_23

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.GridLayoutManager
import com.example.moviesapp09_01_23.adapter.MovieAdapter
import com.example.moviesapp09_01_23.apiProvider.ApiClient
import com.example.moviesapp09_01_23.databinding.ActivityMainBinding
import com.example.moviesapp09_01_23.models.MovieData
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var lista = mutableListOf<MovieData>()
    lateinit var adapter: MovieAdapter
    var key = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        key = getString(R.string.api_key)
        setRecycler()
    }

    private fun setRecycler() {
        val layoutManager = GridLayoutManager(this, 2)
        binding.recPelis.layoutManager = layoutManager
        adapter = MovieAdapter(lista)
        binding.recPelis.adapter = adapter
        traerPeliculas()
    }

    private fun traerPeliculas() {
        lifecycleScope.launch {
            val datos = ApiClient.apiClient.getPopularMovies(key)

            adapter.lista = datos.results.toMutableList()
            adapter.notifyDataSetChanged()
        }
    }
}