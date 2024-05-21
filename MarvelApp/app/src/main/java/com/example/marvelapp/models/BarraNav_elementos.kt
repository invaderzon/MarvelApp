package com.example.marvelbaseproject.models

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Home
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.marvelbaseproject.R

enum class Rutas{
    home,
    personajes,
    publicaciones,
    noticias
}

sealed class Elementos(
    val ruta:String,
    @StringRes val titulo:Int,
    val icono:Int,
    val IconoSelect:Int
){
    object Home:Elementos(
        Rutas.home.name,
        R.string.str_home,
        R.drawable.hogar,
        R.drawable.hogar

    )
    object Personajes:Elementos(
        Rutas.personajes.name,
        R.string.str_personajes,
        R.drawable.hogar,
        R.drawable.hogar
    )
    object Publicaciones:Elementos(
        Rutas.publicaciones.name,
        R.string.str_publis,
        R.drawable.hogar,
        R.drawable.hogar

    )
    object Noticias:Elementos(
        Rutas.noticias.name,
        R.string.str_noticias,
        R.drawable.hogar,
        R.drawable.hogar

    )
}