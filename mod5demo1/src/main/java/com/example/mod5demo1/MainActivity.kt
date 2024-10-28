package com.example.mod5demo1

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.example.mod5demo1.ui.theme.DemoRcda32Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DemoRcda32Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    GoToOtherActivity()
                }
            }
        }
    }
}

@Composable
fun GoToOtherActivity() {

    val context = LocalContext.current

    Button(onClick = {
        Intent(context, TargetActivity::class.java).also {

            context.startActivity(it)
        }


    }) {
        Text(text = "GO TO !")
    }

}