package com.example.marvelbaseproject.models

import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.marvelbaseproject.R


@Composable
fun Personajes(){
    Row(modifier = Modifier
        .padding(60.dp,0.dp)
        .horizontalScroll(rememberScrollState())
        ,horizontalArrangement = Arrangement.Center
    ){
        Image(painter = painterResource(id = R.drawable.spider_man), contentDescription =null )
        Image(painter = painterResource(id = R.drawable.sc_wtch) , contentDescription = null)
        Image(painter = painterResource(id = R.drawable.capitan_a), contentDescription = null)
        Image(painter = painterResource(id = R.drawable.wolverine), contentDescription = null)
        Image(painter = painterResource(id = R.drawable.iron_man), contentDescription = null)
        Image(painter = painterResource(id = R.drawable.magneto), contentDescription = null)

    }
}