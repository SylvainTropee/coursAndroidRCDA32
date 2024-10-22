package com.example.mod3demo4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mod3demo4.ui.theme.DemoRcda32Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

        }
    }
}

@Composable
fun SpacerExample(modifier : Modifier = Modifier){
    Column {
        Text("La communauté de l'anneau")
        Spacer(modifier = modifier.height(8.dp))
        Row(modifier = modifier.height(IntrinsicSize.Min)) {
            Text("Les deux tours", Modifier.padding(horizontal = 8.dp))
            Spacer(modifier = Modifier.fillMaxHeight().width(2.dp).background(Color.Red))
            Spacer(modifier = Modifier.width(2.dp))
            Spacer(modifier = Modifier.fillMaxHeight().width(2.dp).background(Color.Red))
        }

        Spacer(modifier = Modifier.height(8.dp))
        Text("Le retour du roi")
    }

}

@Composable
@Preview
fun Preview(){
    SpacerExample()
}

