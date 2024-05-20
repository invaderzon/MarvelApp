package com.example.marvelapp.db

import android.content.Context
import com.example.marvelapp.models.Personaje
import com.example.marvelapp.models.Publicacion
import com.google.gson.Gson
import java.io.BufferedReader
import java.io.InputStreamReader

object Datos {
    fun getPersonajes(context : Context?) : List<Personaje>{
        return try {
            val gson = Gson()
            val jsonString = readJsonAsset(context, "characters.json")
            gson.fromJson(jsonString, Array<Personaje>::class.java).toList()
        } catch (e: Exception) {
            emptyList()
        }
    }
    fun getPublicaciones(context : Context?) : Map<String, List<Publicacion>> {
        val lista = try {
            val gson = Gson()
            val jsonString = readJsonAsset(context, "publications.json")
            gson.fromJson(jsonString, Array<Publicacion>::class.java).toList()
        } catch (e: Exception) {
            emptyList()
        }
        return lista.groupBy(keySelector = {it.formato}, valueTransform = {it})
    }

    private fun readJsonAsset(context: Context?, path: String) : String{
        return try {
            val file = context?.assets?.open("$path")
            val bufferedReader = BufferedReader(InputStreamReader(file))
            val stringBuilder = StringBuilder()
            bufferedReader.useLines { lines ->
                lines.forEach {
                    stringBuilder.append(it)
                }
            }
            stringBuilder.toString()
        } catch (e: Exception) {
            e.printStackTrace()
            ""
        }
    }
}