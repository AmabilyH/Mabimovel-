package edu.app.primeiromabitivo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import edu.app.primeiromabitivo.ui.theme.PrimeiroMabitivoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PrimeiroMabitivoTheme {
                }
            }

    }
}
data class Message(val author: String, val body: String)

@Composable
fun MessageCard(msg: Message) {
    Row {
        Image(
            painter = painterResource(R.drawable.perfil),
            contentDescription = "imagem do perfil",
            modifier = Modifier
                .size(49.dp)
                .clip(_root_ide_package_.androidx.compose.foundation.shape.CircleShape)
        )
        Spacer(modifier = Modifier.width(10.dp))
        Column {
            Text(text = msg.author)
            Spacer(modifier = Modifier.height(5.dp))
            Text(text = msg.body)

        }
    }
}
@Preview
@Composable
fun Preview() {
    Column {
        MessageCard(msg = Message("Sabrina Carpente", "Cantora famosa"))
        MessageCard(msg = Message("Carpente Mars", "Jovem sonhadora"))
        MessageCard(msg = Message("Ananda", "Menina brilhante"))
        }
    }
