package io.github.acm_ndsu.acmapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class Snacks : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // Calling the composable function
            // to display element and its contents
            Mycontent()
        }
    }
}

// Creating a composable function to create a simple card
// Calling this function as content in the above function
@Composable
fun Mycontent(){
    Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Card{
            Column(Modifier.padding(10.dp)) {
                Text("Monster", fontWeight = FontWeight.W700)
                Text("$1.75")
            }
        }
    }
}

// For displaying preview in the
// Android Studio IDE emulator
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Snacks()
}
