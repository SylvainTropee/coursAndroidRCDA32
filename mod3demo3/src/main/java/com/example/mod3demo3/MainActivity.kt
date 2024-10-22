package com.example.mod3demo3


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Face
import androidx.compose.material3.Icon

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

        }
    }
}


@Composable
fun RowAndColumnExample(){

    Column {
        Text("Exemple pour row et column")
        Row {
            Text("Item 1")
            Text("Item 2")
            Text("Item 3")
        }
        Column {
            Text("Item A")
            Text("Item B")
            Text("Item C")
        }
    }
}

@Composable
fun BoxExample(){

    Box(contentAlignment = Alignment.BottomCenter) {
        Image(
            painter = painterResource(id = R.drawable.compose_man),
            contentDescription = "Compose Man")
        Icon(
            imageVector = Icons.Default.Face,
            contentDescription = null,
            tint = Color.Red
        )
    }

}

@Preview
@Composable
fun Preview(){
    BoxExample()
}

