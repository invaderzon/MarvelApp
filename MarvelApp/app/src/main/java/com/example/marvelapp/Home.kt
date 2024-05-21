package com.example.marvelbaseproject

import android.provider.SyncStateContract.Columns
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.marvelbaseproject.models.FilasPopulares
import com.example.marvelbaseproject.models.Personajes
import com.example.marvelbaseproject.models.persona
import com.example.marvelbaseproject.ui.theme.AzulGris
import com.example.marvelbaseproject.ui.theme.RojoComic
import okhttp3.internal.wait
import java.lang.reflect.Modifier

@Composable
fun pantallaPrinciplal(){
    Column(modifier =
    androidx.compose.ui.Modifier

        .fillMaxWidth()
        .background(MaterialTheme.colorScheme.surfaceContainer)
    ){
        Box(modifier = androidx.compose.ui.Modifier
            .fillMaxWidth()
            .padding(0.dp,10.dp),
            contentAlignment = Alignment.Center
        ){
            Text(text = stringResource(id = R.string.str_titulo_home),
                color = RojoComic,
                style = MaterialTheme.typography.titleLarge,
                modifier = androidx.compose.ui.Modifier)
        }

        Column(modifier = androidx.compose.ui.Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(50.dp, 50.dp,0.dp,0.dp))
            .background(MaterialTheme.colorScheme.background)
        ){

            Box(modifier = androidx.compose.ui.Modifier
                .fillMaxWidth()
                .padding(20.dp),
                contentAlignment = Alignment.Center){
                Personajes()
            }

            Column(modifier = androidx.compose.ui.Modifier
                .fillMaxWidth()
                .padding(15.dp)){
                Text(text = stringResource(id = R.string.str_texto_home),
                    modifier = androidx.compose.ui.Modifier.padding(10.dp),
                    textAlign = TextAlign.Justify
                )
                Text(text = stringResource(id = R.string.str_texto_home2),
                    modifier = androidx.compose.ui.Modifier.padding(10.dp),
                    textAlign = TextAlign.Justify
                )
                Text(text = stringResource(id = R.string.str_texto_home3),
                    modifier = androidx.compose.ui.Modifier.padding(10.dp),
                    textAlign = TextAlign.Justify
                )
                Box(modifier = androidx.compose.ui.Modifier
                    .padding(20.dp).fillMaxWidth(), contentAlignment = Alignment.Center
                ){
                    Image(painter = painterResource(id = R.drawable.avengers_chibi__1_), contentDescription =null )
                }
            }

            Box(modifier = androidx.compose.ui.Modifier
                .padding(20.dp)
                .fillMaxWidth(), contentAlignment = Alignment.Center){
                Text(
                    text = stringResource(id = R.string.str_sub1_home),
                    modifier = androidx.compose.ui.Modifier.padding(10.dp),
                    style = MaterialTheme.typography.titleMedium
                )
            }

            FilasPopulares(
                stringResource(id = R.string.str_categoria1),
                painterResource(id = R.drawable.cw_c), stringResource(id = R.string.str_comic1),
                painterResource(id = R.drawable.din_dm), stringResource(id = R.string.str_comic2),
                painterResource(id = R.drawable.marvels), stringResource(id = R.string.str_comic3),
                painterResource(id = R.drawable.l_vision), stringResource(id = R.string.str_comic4),
                painterResource(id = R.drawable.p_hulk), stringResource(id = R.string.str_comic5)
            )

            FilasPopulares(
                stringResource(id = R.string.str_categoria2),
                painterResource(id = R.drawable.sm_n), stringResource(id = R.string.str_pelicula1),
                painterResource(id = R.drawable.sm_atsv), stringResource(id = R.string.str_pelicula2),
                painterResource(id = R.drawable.sm_anu), stringResource(id = R.string.str_pelicula3),
                painterResource(id = R.drawable.avinfw), stringResource(id = R.string.str_pelicula4),
                painterResource(id = R.drawable.avendg), stringResource(id = R.string.str_pelicula5)
            )

            Row(modifier = androidx.compose.ui.Modifier
                .clip(RoundedCornerShape(10.dp))
                .padding(20.dp)
                .fillMaxWidth()
            ){
                Column {
                    Text(text = stringResource(id = R.string.str_sub2_home),
                        modifier = androidx.compose.ui.Modifier
                            .fillMaxWidth()
                            .padding(5.dp),
                        textAlign = TextAlign.Center,
                        style = MaterialTheme.typography.titleMedium)
                    Column(modifier = androidx.compose.ui.Modifier.fillMaxWidth(), verticalArrangement = Arrangement.Center) {
                        persona(
                            painterResource(id = R.drawable.stanlee),
                            stringResource(id = R.string.str_persona1))
                        persona(
                            painterResource(id = R.drawable.jackkirby),
                            stringResource(id = R.string.str_persona2)
                        )
                    }
                }
            }

        }





    }
}


@Preview
@Composable
fun homePreview(){
    pantallaPrinciplal()
}