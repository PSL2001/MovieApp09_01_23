package com.example.moviesapp09_01_23.models

import com.google.gson.annotations.SerializedName

data class MovieData(
    //Si no lo quieres llamar igual que el json, puedes ponerle un nombre diferente asi
    @SerializedName("backdrop_path") val caratula: String,
    @SerializedName("title") val titulo: String,
    val overview: String,
    @SerializedName("release_date") val fecha: String,
    @SerializedName("poster_path") val poster: String,
) : java.io.Serializable
