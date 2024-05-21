package com.example.marvelbaseproject.models

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.marvelbaseproject.R
import com.example.marvelbaseproject.ui.theme.RojoComic
import java.lang.reflect.Modifier

@Composable
fun FilasPopulares(
    categoria:String,
    imagen1:Painter, titulo1:String,
    imagen2:Painter,titulo2:String,
    imagen3:Painter,titulo3:String,
    imagen4:Painter,titulo4:String,
    imagen5:Painter,titulo5:String){
    Row(modifier = androidx.compose.ui.Modifier
        .padding(0.dp, 20.dp)
        .background(MaterialTheme.colorScheme.surfaceContainer)
    ){
        Column(modifier = androidx.compose.ui.Modifier
            .fillMaxWidth()
        ){
            Row(modifier = androidx.compose.ui.Modifier
                .fillMaxWidth()
                .padding(15.dp)) {
                Text(text = categoria, style = MaterialTheme.typography.titleMedium)
            }
            Row (modifier = androidx.compose.ui.Modifier
                .horizontalScroll(rememberScrollState())
                .clip(RoundedCornerShape(10.dp))

            ){
                populares(imagen1,titulo1)
                populares(imagen2,titulo2)
                populares(imagen3,titulo3)
                populares(imagen4,titulo4)
                populares(imagen5,titulo5)
            }

        }

    }
}

@Composable
fun populares(objeto: Painter, titulo:String){
    Box(modifier = androidx.compose.ui.Modifier.padding(5.dp)){
        Column(modifier = androidx.compose.ui.Modifier
            .width(150.dp)
            .padding(10.dp)
        ) {
            Image(
                painter = objeto,
                contentDescription = null,
                modifier = androidx.compose.ui.Modifier.clip(RoundedCornerShape(20.dp))
            )
            Text(text = titulo, textAlign = TextAlign.Center,
                modifier = androidx.compose.ui.Modifier
                    .padding(5.dp)
            )

        }
    }


}



@Preview
@Composable
fun popularesPreview(){
    FilasPopulares(
        stringResource(id = R.string.str_categoria1),
        painterResource(id = R.drawable.spiderman_nwh), stringResource(id = R.string.str_pelicula1),
        painterResource(id = R.drawable.spiderman_nwh), stringResource(id = R.string.str_pelicula1),
        painterResource(id = R.drawable.spiderman_nwh), stringResource(id = R.string.str_pelicula1),
        painterResource(id = R.drawable.spiderman_nwh), stringResource(id = R.string.str_pelicula1),
        painterResource(id = R.drawable.spiderman_nwh), stringResource(id = R.string.str_pelicula1)
    )
}