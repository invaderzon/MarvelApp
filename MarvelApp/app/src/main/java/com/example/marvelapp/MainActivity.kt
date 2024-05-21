@file:OptIn(ExperimentalFoundationApi::class)

package com.example.marvelbaseproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.marvelbaseproject.models.Elementos
import com.example.marvelbaseproject.models.barra_navegacion
import com.example.marvelbaseproject.ui.theme.MarvelBaseProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MarvelBaseProjectTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Main()
                }
            }
        }
    }
}

@Composable
fun Main(modifier: Modifier = Modifier){
    var titulo by remember {
        mutableStateOf(Elementos.Home.titulo)
    }
    val navController = rememberNavController()
    Scaffold(
        bottomBar ={
            barra_navegacion(navController){
                titulo=it}
        },
        topBar = {}
    ) {
        NavHost(
            navController =navController ,
            startDestination =Elementos.Home.ruta,
            modifier = Modifier
                .verticalScroll(
                    rememberScrollState()
                )
                .fillMaxHeight()
                .background(MaterialTheme.colorScheme.background)
                .padding(it)
        ) {
            composable(Elementos.Home.ruta){
                pantallaPrinciplal()
            }
            composable(Elementos.Personajes.ruta){
                pantallaPersoanjes()
            }
            composable(Elementos.Publicaciones.ruta){}
            composable(Elementos.Noticias.ruta){}
        }
}
}

@Preview()
@Composable
fun GreetingPreview() {
    MarvelBaseProjectTheme {
        Main()
    }
}