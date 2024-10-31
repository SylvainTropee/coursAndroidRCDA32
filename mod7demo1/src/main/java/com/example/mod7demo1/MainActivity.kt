package com.example.mod7demo1

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.mod7demo1.ui.theme.DemoRcda32Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DemoRcda32Theme {
                JokeDisplay()
            }
        }
    }
}

private const val TAG = "MainActivity"


@Composable
fun JokeDisplay(jokeViewModel: JokeViewModel = viewModel(factory = JokeViewModel.Factory)) {

    val joke by jokeViewModel.joke.collectAsState()
    Log.i(TAG, "JokeDisplay: $joke")

    Column(){
        joke?.id?.let { Text(text = it) }
        joke?.value?.let { Text(text = it) }
        joke?.createdDate?.let { Text(text = it.toString()) }
    }

}

