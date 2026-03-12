package edu.app.primeiromabitivo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Contador()
                }
            }

    }

@Composable
fun Contador() {
    var contador by remember { mutableStateOf(0) }

    Button(onClick = { contador += 1 }) {
        Text("Cliquei $contador vezes")
    }
}

@Preview(showBackground = true)
@Composable
fun ContadorPreview() {
    Contador()
}