package com.example.marvelbaseproject.models

import com.google.gson.annotations.SerializedName

data class Personaje(
    @SerializedName("description")
    val descripcion: String,
    @SerializedName("events")
    val eventos: List<String>,
    @SerializedName("id")
    val identificador: Int,
    @SerializedName("name")
    val nombre: String,
    @SerializedName("thumbnail")
    val imagenThumb: String
)