package com.example.mod4demo3

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
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.mod4demo3.ui.theme.DemoRcda32Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DemoRcda32Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    CandyScreen()
                }
            }
        }
    }
}

@Composable
fun CandyScreen(
    candyViewModel: CandyViewModel = viewModel(factory = CandyViewModel.Factory)) {

    val candies by candyViewModel.candies.collectAsState()

    LazyColumn() {
        items(candies) {
            Text(text = it, fontSize = 40.sp)
        }
    }


}








