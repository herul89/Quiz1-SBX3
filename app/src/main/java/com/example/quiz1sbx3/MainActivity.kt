package com.example.quiz1sbx3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.quiz1sbx3.ui.theme.Quiz1SBX3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Quiz1SBX3Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    HalamanDepan()
                }
            }
        }
    }
}

@Composable
fun HalamanDepan() {
    IsiHalaman(
        logoAtas = painterResource(R.drawable.hsi_sakinah_logo),
        title = stringResource(R.string.title),
        descIsi = stringResource(R.string.descIsi),
        logoPencarian = painterResource(R.drawable.pencarian),
        bawahButoon1 = "Home",
        bawahButoon2 = "Pencarian" ,
        bawahButoon3 = "Profile"
    )

}

@Composable
fun IsiHalaman(
    logoAtas : Painter,
    title : String,
    descIsi : String,
    logoPencarian : Painter,
    bawahButoon1 : String,
    bawahButoon2 : String,
    bawahButoon3 : String,
    modifier: Modifier = Modifier
) {
    Column (modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Image(painter = logoAtas, contentDescription = null)

        Column (modifier = Modifier,
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally){
            Text(
                text = title,
                modifier = Modifier.padding(top = 24.dp, bottom = 8.dp),
                fontWeight = FontWeight.Bold
            )
            Text(
                text = descIsi,
                modifier = Modifier.padding(start = 16.dp, end = 16.dp),
                textAlign = TextAlign.Center
                )
            Image(painter = logoPencarian, contentDescription = null)
            Row {
                Button(
                    onClick = { /*TODO*/ },

                    ) {
                    Text(
                        text = "Lewati")


                }
                Button(onClick = { /*TODO*/ }
                ) {
                    Text(text = "Isi CV")

                }
            }

        }
        Row (modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround) {
            val icon = painterResource(R.drawable.baseline_add_home_24)
            Column(modifier = Modifier, horizontalAlignment = Alignment.CenterHorizontally) {
                Icon(painter = icon, contentDescription = null)
                Text(text = bawahButoon1)
            }
            Column (modifier = Modifier, horizontalAlignment = Alignment.CenterHorizontally) {
                val icon2 = painterResource(R.drawable.baseline_ads_click_24)
                Icon(painter = icon2, contentDescription = null)
                Text(text = bawahButoon2)
            }
            Column (modifier = Modifier, horizontalAlignment = Alignment.CenterHorizontally) {
                val icon3 = painterResource(R.drawable.baseline_account_box_24)
                Icon(painter = icon3, contentDescription = null)
                Text(text = bawahButoon3)
            }

        }


    }


}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Quiz1SBX3Theme {
        HalamanDepan()
    }
}