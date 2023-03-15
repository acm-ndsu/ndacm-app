package io.github.acm_ndsu.acmapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
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
fun Snacks(){
    val rowM = Modifier.fillMaxWidth()
    val cardArrangement = Arrangement.SpaceAround
    val cardM = Modifier.padding(10.dp).border(1.dp,Color.Black, shape = RoundedCornerShape(20))
    val columnM = Modifier.padding(10.dp).width(120.dp)

    Column(Modifier.fillMaxWidth().fillMaxHeight(), verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally) {
        Row(modifier = rowM, horizontalArrangement = cardArrangement) {
            Card(modifier = cardM) {
                Column(modifier = columnM) {
                    Text("Monster", fontWeight = FontWeight.W700)
                    Text("$1.75")
                }
            }
            Card(modifier = cardM) {
                Column(modifier = columnM) {
                    Text("Soda", fontWeight = FontWeight.W700)
                    Text("$0.50")
                }
            }
        }
        Row(modifier = rowM, horizontalArrangement = cardArrangement) {
            Card(modifier = cardM) {
                Column(modifier = columnM) {
                    Text("Arnold Palmer", fontWeight = FontWeight.W700)
                    Text("$0.50")
                }
            }
            Card(modifier = cardM) {
                Column(modifier = columnM) {
                    Text("Polar:Flavored Water", fontWeight = FontWeight.W700)
                    Text("$0.50")
                }
            }
        }
        Row(modifier = rowM, horizontalArrangement = cardArrangement) {
            Card(modifier = cardM) {
                Column(modifier = columnM) {
                    Text("Chicken Melts", fontWeight = FontWeight.W700)
                    Text("$1.00")
                }
            }
            Card(modifier = cardM) {
                Column(modifier = columnM) {
                    Text("Pizza", fontWeight = FontWeight.W700)
                    Text("$1.00")
                }
            }
        }
        Row(modifier = rowM, horizontalArrangement = cardArrangement) {
            Card(modifier = cardM) {
                Column(modifier = columnM) {
                    Text("Stroopwafels", fontWeight = FontWeight.W700)
                    Text("$0.50")
                }
            }
            Card(modifier = cardM) {
                Column(modifier = columnM) {
                    Text("Chips", fontWeight = FontWeight.W700)
                    Text("$0.50")
                }
            }
        }
        Row(modifier = rowM, horizontalArrangement = cardArrangement) {
            Card(modifier = cardM) {
                Column(modifier = columnM) {
                    Text("Nabisco Treats", fontWeight = FontWeight.W700)
                    Text("$0.50")
                }
            }
            Card(modifier = cardM) {
                Column(modifier = columnM) {
                    Text("Nutrigrain bar", fontWeight = FontWeight.W700)
                    Text("$0.50")
                }
            }
        }
        Row(modifier = rowM, horizontalArrangement = cardArrangement) {
            Card(modifier = cardM) {
                Column(modifier = columnM) {
                    Text("Granola Bars", fontWeight = FontWeight.W700)
                    Text("$0.25")
                }
            }
            Card(modifier = cardM) {
                Column(modifier = columnM) {
                    Text("Rice Crispy treat", fontWeight = FontWeight.W700)
                    Text("$0.25")
                }
            }
        }
        Row(modifier = rowM, horizontalArrangement = cardArrangement) {
            Card(modifier = cardM) {
                Column(modifier = columnM) {
                    Text("Fruit Snacks", fontWeight = FontWeight.W700)
                    Text("$0.25")
                }
            }
            Card(modifier = cardM) {
                Column(modifier = columnM) {
                    Text("Ice Cream Bars", fontWeight = FontWeight.W700)
                    Text("$0.75")
                }
            }
        }
    }
}
