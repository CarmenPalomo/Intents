package com.example.pruebaprogramacionmultimedia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val titulo : EditText = findViewById(R.id.titulo)
        val paginas : EditText = findViewById(R.id.paginas)
        val botonLibro : Button = findViewById(R.id.botonLibro)

        botonLibro.setOnClickListener{
            val intent = Intent(this, BookDetailsActivity::class.java)
            intent.putExtra("libro", titulo.text.toString())
            intent.putExtra("paginas", paginas.text.toString())

            startActivity(intent)
        }
    }
}