package com.example.mod4tp1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.mod4tp1.ui.theme.DemoRcda32Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DemoRcda32Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                   Column(modifier = Modifier.padding(innerPadding)){
                        Dice()

                   }
                }
            }
        }
    }
}


@Composable
fun Dice( viewModel: DiceViewModel = viewModel()){

    val totalLaunch by viewModel.totalLaunch.collectAsState()

    Text("Gauche = ${viewModel.totalLeft} / ${viewModel.totalLaunchLeft}")
    Button(onClick = {
        viewModel.rollLeft()
    }){
        Text("GAUCHE")
    }
    Text("Droite = ${viewModel.totalRight} / ${viewModel.totalLaunchRight}")
    Button(onClick = {
        viewModel.rollRight()
    }){
        Text("DROITE")
    }

    Text("Total Launch = $totalLaunch")
    Image(painter = painterResource(viewModel.diceImageId), contentDescription = null)

}

