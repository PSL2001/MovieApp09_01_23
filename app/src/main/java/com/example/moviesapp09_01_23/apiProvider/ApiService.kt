package com.example.moviesapp09_01_23.apiProvider

import com.example.moviesapp09_01_23.models.Movies
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("3/movie/popular")
    suspend fun getPopularMovies(@Query("api_key") api_key: String): Movies
}