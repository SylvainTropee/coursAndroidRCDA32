package com.example.mod6demo1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.mod6demo1.ui.theme.DemoRcda32Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DemoRcda32Theme {
                ColorSettingsScreen()
            }
        }
    }
}

@Composable
fun ColorSettingsScreen(
    colorSettingsViewModel: ColorSettingsViewModel = viewModel(factory = ColorSettingsViewModel.Factory)) {

    val colors = listOf(Color.Cyan, Color.Green, Color.Yellow, Color.Magenta)
    val colorPref by colorSettingsViewModel.colorPref.collectAsState()

    Scaffold(
        containerColor = colorPref
    ) {
        Column(
            modifier = Modifier.padding(it)
        ) {
            colors.forEach { color ->

                Spacer(
                    modifier = Modifier
                        .background(color)
                        .fillMaxWidth()
                        .height(40.dp)
                        .border(1.5.dp, Color.Black)
                        .clickable {
                            colorSettingsViewModel.setBgColor(color)
                        }
                )
            }
        }
    }
}

@Composable
@Preview
fun Preview() {
    ColorSettingsScreen()
}
