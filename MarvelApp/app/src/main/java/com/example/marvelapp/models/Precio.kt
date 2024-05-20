package com.example.marvelapp.models

import com.google.gson.annotations.SerializedName

data class Precio(
    @SerializedName("price")
    val precio: Double,
    @SerializedName("type")
    val tipo: String
)