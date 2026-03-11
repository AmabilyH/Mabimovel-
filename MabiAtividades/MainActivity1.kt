package edu.app.primeiromabitivo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import edu.app.primeiromabitivo.ui.theme.PrimeiroMabitivoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PrimeiroMabitivoTheme {
                Minhatela()
                }
            }

    }
}

@Composable
fun Minhatela(){
    Row (
        horizontalArrangement = Arrangement.spacedBy(8.dp),
        modifier = Modifier.padding(16.dp)
    ) {

        Column (
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ){
            Text(text = "Brasil,", style = MaterialTheme.typography.titleMedium)
            Text(text = "Pe")
        }
         Column(
             verticalArrangement = Arrangement.spacedBy(8.dp)
         ){
            Text(text = "IFPE")
            Text(text = "Palmares")
        }
    }

}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PrimeiroMabitivoTheme {
        Minhatela()
    }
}
