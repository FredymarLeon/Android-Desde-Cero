package com.fleon.androiddesdecero.primerapp

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.fleon.androiddesdecero.R

class PrimerAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_primer_app)    //función que vincula la logica con lo visual.
        //Al arrancar la pantalla
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btnStart = findViewById<AppCompatButton>(R.id.btnStart)     //Engancho mi botton
        val editTextName = findViewById<AppCompatEditText>(R.id.editTextName)

        btnStart.setOnClickListener {   //Cuando clique el boton, haz lo siguiente:
            //Log.i("Fredymar, "Botón clicado")
            val name = editTextName.text.toString()     //Cuando el boton sea clicado, voy a mostrar un mensaje. lo que está em name me va a retornar el texto.

            if(name.isNotEmpty()) {
                val intent = Intent(this, SegundaActivity::class.java)   //Abre la otra Activity:
                intent.putExtra("ACTION_NAME", name) //Envio del nombre que es ingresado en la primera activiti para  la segunda.
                startActivity(intent)   //Abre esa activity que esta aqui.
            }
        }
    }
}