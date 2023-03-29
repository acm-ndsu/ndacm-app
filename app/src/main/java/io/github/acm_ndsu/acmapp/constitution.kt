package io.github.acm_ndsu.acmapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

// Creating a composable function to create a simple card
// Calling this function as content in the above function
@Composable
fun constitution() {


    val buttonColors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF00382B))
    val buttonPadding = PaddingValues(
        start = 20.dp,
        top = 12.dp,
        end = 20.dp,
        bottom = 12.dp
    )
    val buttonModifier = Modifier.fillMaxWidth()
    val rowM = Modifier.fillMaxWidth()
    val cardArrangement = Arrangement.SpaceAround
    val cardM = Modifier.padding(10.dp)
    val columnM = Modifier
        .padding(10.dp)
        .width(120.dp)

    Column(
        Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(modifier = rowM, horizontalArrangement = cardArrangement) {
            Column(modifier = columnM) {
                Button(
                    onClick = {},
                    modifier = buttonModifier,
                    colors = buttonColors,
                    contentPadding = buttonPadding
                ) {
                    Text(
                        "Article I",
                        color = Color.White
                    )
                }
            }
            Column(modifier = columnM) {
                Button(
                    onClick = {},
                    modifier = buttonModifier,
                    colors = buttonColors,
                    contentPadding = buttonPadding
                ) {
                    Text(
                        "Article II",
                        color = Color.White
                    )
                }
            }

        }
        Row(modifier = rowM, horizontalArrangement = cardArrangement) {

            Column(modifier = columnM) {
                Button(
                    onClick = {},
                    modifier = buttonModifier,
                    colors = buttonColors,
                    contentPadding = buttonPadding
                ) {
                    Text(
                        "Article III",
                        color = Color.White
                    )
                }
            }


            Column(modifier = columnM) {
                Button(
                    onClick = {},
                    modifier = buttonModifier,
                    colors = buttonColors,
                    contentPadding = buttonPadding
                ) {
                    Text(
                        "Article IV",
                        color = Color.White
                    )
                }

            }
        }
        Row(modifier = rowM, horizontalArrangement = cardArrangement) {

            Column(modifier = columnM) {
                Button(
                    onClick = {},
                    modifier = buttonModifier,
                    colors = buttonColors,
                    contentPadding = buttonPadding
                ) {
                    Text(
                        "Article V",
                        color = Color.White
                    )
                }
            }


            Column(modifier = columnM) {
                Button(
                    onClick = {},
                    modifier = buttonModifier,
                    colors = buttonColors,
                    contentPadding = buttonPadding
                ) {
                    Text(
                        "Article VI",
                        color = Color.White
                    )
                }
            }

        }
        Row(modifier = rowM, horizontalArrangement = cardArrangement) {

            Column(modifier = columnM) {
                Button(
                    onClick = {},
                    modifier = buttonModifier,
                    colors = buttonColors,
                    contentPadding = buttonPadding
                ) {
                    Text(
                        "Article VII",
                        color = Color.White
                    )
                }
            }


            Column(modifier = columnM) {
                Button(
                    onClick = {},
                    modifier = buttonModifier,
                    colors = buttonColors,
                    contentPadding = buttonPadding
                ) {
                    Text(
                        "Article VIII",
                        color = Color.White
                    )
                }
            }

        }
        Row(modifier = rowM, horizontalArrangement = cardArrangement) {

            Column(modifier = columnM) {
                Button(
                    onClick = {},
                    modifier = buttonModifier,
                    colors = buttonColors,
                    contentPadding = buttonPadding
                ) {
                    Text(
                        "Article IX",
                        color = Color.White
                    )
                }
            }


            Column(modifier = columnM) {
                Button(
                    onClick = {},
                    modifier = buttonModifier,
                    colors = buttonColors,
                    contentPadding = buttonPadding
                ) {
                    Text(
                        "Article X",
                        color = Color.White
                    )
                }
            }

        }
        Row(modifier = rowM, horizontalArrangement = cardArrangement) {

            Column(modifier = columnM) {
                Button(
                    onClick = {},
                    modifier = buttonModifier,
                    colors = buttonColors,
                    contentPadding = buttonPadding
                ) {
                    Text(
                        "Article XI",
                        color = Color.White
                    )
                }
            }


            Column(modifier = columnM) {
                Button(
                    onClick = {},
                    modifier = buttonModifier,
                    colors = buttonColors,
                    contentPadding = buttonPadding
                ) {
                    Text(
                        "Article XII",
                        color = Color.White
                    )
                }
            }

        }
        Row(modifier = rowM, horizontalArrangement = cardArrangement) {

            Column(modifier = columnM) {
                Button(
                    onClick = {},
                    modifier = buttonModifier,
                    colors = buttonColors,
                    contentPadding = buttonPadding
                ) {
                    Text(
                        "Article XIII",
                        color = Color.White
                    )
                }
            }


            Column(modifier = columnM) {
                Button(
                    onClick = {},
                    modifier = buttonModifier,
                    colors = buttonColors,
                    contentPadding = buttonPadding
                ) {
                    Text(
                        "Article XIV",
                        color = Color.White
                    )
                }
            }

        }
    }
}


