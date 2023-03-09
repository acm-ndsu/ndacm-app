package io.github.acm_ndsu.acmapp

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

// Creating a composable function to create a simple card
// Calling this function as content in the above function
@Composable
fun Snacks(){
    Column(Modifier.fillMaxSize(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Card{
            Column(Modifier.padding(10.dp)) {
                Text("Monster", fontWeight = FontWeight.W700)
                Text("$1.75")
            }
        }
    }
}
