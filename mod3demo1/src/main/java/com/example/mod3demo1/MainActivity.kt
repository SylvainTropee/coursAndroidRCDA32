package com.example.mod3demo1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val etName = findViewById<EditText>(R.id.etName)
        val etAge = findViewById<EditText>(R.id.etAge)

        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            val name = etName.text.toString()
            val age = etAge.text.toString()

            Toast.makeText(this, "Bonjour $name", Toast.LENGTH_SHORT).show()
            Snackbar.make(etName, "Bonjour $name", Snackbar.LENGTH_LONG).show()
        }

    }
}