package com.example.mod3demo2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.mod3demo2.ui.theme.DemoRcda32Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Hello(name = "Michel")
        }
    }
}

@Composable
fun Hello(name: String) {
    Scaffold {
        Column(modifier = Modifier.padding(it)) {
            Text(text = "Hello World !")
            Text(text = "Hello World !")
            Text(text = "Hello World !")
            Text(text = "Hello World !")
            Text(text = "Hello World !")
            Text(text = "Hello World !")
            Text(text = "Hello World !")
            Text(text = "Hello World !")
            Text(text = "Hello $name !", color = Color.Red)
        }
    }
}

@Preview
@Composable
fun preview() {
    Hello(name = "MIchel")
}










