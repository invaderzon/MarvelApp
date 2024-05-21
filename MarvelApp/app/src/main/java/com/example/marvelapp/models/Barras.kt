package com.example.marvelbaseproject.models

import android.graphics.drawable.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Done
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemColors
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.NavigationRailItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.marvelbaseproject.ui.theme.RojoComic

@Composable
fun barra_navegacion(controlador:NavController, onCambioTitulo:(Int)->Unit){
    val pantallas = listOf(
        Elementos.Home,
        Elementos.Personajes,
        Elementos.Publicaciones,
        Elementos.Noticias
    )

    NavigationBar() {
        val navBackStackEntry by controlador.currentBackStackEntryAsState()
        val destinoActual = navBackStackEntry?.destination

        pantallas.forEach{
            elemento ->
            val seleccion = destinoActual?.route==elemento.ruta
            val icono_barra: Painter = painterResource(id = elemento.icono)

        NavigationBarItem(
            colors = NavigationBarItemDefaults.colors(
                selectedIconColor= RojoComic,
                selectedTextColor = RojoComic,
                indicatorColor = Color.Transparent,
                unselectedIconColor = MaterialTheme.colorScheme.onBackground,
                unselectedTextColor = MaterialTheme.colorScheme.onBackground,
                disabledIconColor = Color.Transparent,
                disabledTextColor = Color.Transparent
            ),
            selected = seleccion,
            onClick = {
                    onCambioTitulo(elemento.titulo)
                    controlador.navigate(elemento.ruta){
                    popUpTo(controlador.graph.startDestinationId){
                        saveState=true
                    }
                    launchSingleTop=true
                    restoreState=true
                } },
            icon = {
                Icon(
                    if (seleccion) {
                        icono_barra
                    } else {
                        icono_barra
                    }, contentDescription = null,
                    tint =
                    if (seleccion){
                        RojoComic}
                    else{
                        MaterialTheme.colorScheme.onBackground},
                )
            },
            label = {
                Text(text = stringResource(id = elemento.titulo),
                    style = MaterialTheme.typography.bodySmall)
            }
            )
        }
    }
}


@Preview
@Composable fun barras_prev(){

}