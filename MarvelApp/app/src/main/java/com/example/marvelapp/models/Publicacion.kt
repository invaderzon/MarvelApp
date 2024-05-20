package com.example.marvelapp.models

import com.google.gson.annotations.SerializedName

data class Publicacion(
    @SerializedName("description")
    val descripcion: Any,
    @SerializedName("format")
    val formato: String,
    @SerializedName("id")
    val identificador: Int,
    @SerializedName("issueNumber")
    val numero: Int,
    @SerializedName("pageCount")
    val paginas: Int,
    @SerializedName("prices")
    val precios: List<Precio>,
    @SerializedName("thumbnail")
    val portada: String,
    @SerializedName("title")
    val titulo: String
)