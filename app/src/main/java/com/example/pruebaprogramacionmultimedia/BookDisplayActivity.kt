package com.example.pruebaprogramacionmultimedia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class BookDisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_book_display)

        val listaLibros : Book
        val arrayLista : ArrayList<Book> = arrayListOf()
        val ListaLibros : TextView = findViewById(R.id.listaLibros)


        val mensajeLibro : TextView = findViewById(R.id.mensajeLibro)
        val mensajePagina : TextView = findViewById(R.id.mensajePagina)
        val mensajeAutor : TextView = findViewById(R.id.mensajeAutor)
        val mensajeAño : TextView = findViewById(R.id.mensajeAño)

        val botonVuelta : Button = findViewById(R.id.botonVuelta)

        val libro = intent.getStringExtra("libro")
        val pagina = intent.getStringExtra("paginas")
        val autor = intent.getStringExtra("autor")
        val año = intent.getStringExtra("año")

        mensajeLibro.text ="$libro"
        mensajePagina.text ="$pagina"
        mensajeAutor.text = "$autor"
        mensajeAño.text = "$año"

        listaLibros = Book(libro, pagina, autor, año)
        arrayLista.add(listaLibros)
        var i = 0
        while (i < arrayLista.size){
            ListaLibros.text = arrayLista[i].toString()
            i += 1
        }




        botonVuelta.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }
    }
}