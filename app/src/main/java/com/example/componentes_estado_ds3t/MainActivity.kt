package com.example.componentes_estado_ds3t


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.componentes_estado_ds3t.ui.theme.ComponentesEstadoDS3TTheme
import com.example.componentes_estado_ds3t.ui.theme.fonte

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComponentesEstadoDS3TTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                   BasicComponetsScreen(
                       modifier = Modifier.padding(innerPadding)
                   )

                }
            }
        }
    }
}


@Composable
fun BasicComponetsScreen(modifier: Modifier = Modifier) {
    Column(
        modifier
            .fillMaxSize()
            .background(
                Color(239, 247, 207)

            )
    ) {


        Text(
            text = "Aulas android",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF3DDC84),
            modifier = Modifier
                .fillMaxWidth(),
            textAlign = TextAlign.End,
            letterSpacing = 4.sp


        )
        Text(
            text = "Com o jetpack compose",
            fontSize = 16.sp,
            fontWeight = FontWeight.SemiBold,
            color = Color(66, 137, 244),
            fontFamily = fonte,
            modifier = Modifier.align(Alignment.CenterHorizontally)

        )


        AndroidEnemy(
            modifier = Modifier.size(100.dp),
            color = Color.Red
        )





        AndroidEnemy(
            modifier = Modifier.size(100.dp),
            color = Color.Black
        )
    }
}

@Composable
fun AndroidEnemy(
    color: Color,
    modifier: Modifier = Modifier
) {
    Image(
        modifier = modifier,
        painter = painterResource(R.drawable.ic_launcher_foreground),
        colorFilter = ColorFilter.tint(color = color),
        contentDescription = "Android Enemy"
    )

}