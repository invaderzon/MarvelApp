package com.example.marvelbaseproject.models

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.marvelbaseproject.R

@Composable
fun persona(Foto:Painter, texto:String){
    Row(modifier = Modifier.padding(10.dp)) {
        Image(painter = Foto,
            contentDescription =null, modifier = Modifier.weight(1f))

        Box(modifier = Modifier.weight(1f)
            .align(Alignment.CenterVertically)
            .padding(10.dp)){
            Text(text = texto, textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth(), fontSize = 15.sp)
        }

    }
}

@Preview
@Composable
fun filapreview(){

}