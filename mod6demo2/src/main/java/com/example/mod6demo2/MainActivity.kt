package com.example.mod6demo2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.mod6demo2.ui.theme.DemoRcda32Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DemoRcda32Theme {
                CoffeeVariety()
            }
        }
    }
}

@Composable
fun CoffeeVariety(
    coffeeVarietyViewModel: CoffeeVarietyViewModel = viewModel(factory = CoffeeVarietyViewModel.Factory)) {

    val coffeeVarieties by coffeeVarietyViewModel.coffeeVarieties.collectAsState()

    LazyColumn(){
        items(coffeeVarieties){
            Text(text = "${it.name}, ${it.origin}, ${it.type}")
        }
    }














}