package com.example.pruebaprogramacionmultimedia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class BookDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_details)

        val autor : EditText = findViewById(R.id.Autor)
        val año : EditText = findViewById(R.id.año)

        val libro = intent.getStringExtra("libro")
        val pagina = intent.getStringExtra("paginas")

        val botonAutor : Button = findViewById(R.id.botonAutor)

        botonAutor.setOnClickListener{
            val intent = Intent(this, BookDisplayActivity::class.java)

            intent.putExtra("autor", autor.text.toString())
            intent.putExtra("año", año.text.toString())
            intent.putExtra("libro", libro)
            intent.putExtra("paginas", pagina)

            startActivity(intent)
        }
    }
}