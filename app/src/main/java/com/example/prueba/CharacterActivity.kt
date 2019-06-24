package com.example.prueba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_character.*

class CharacterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_character)

        //Variable para tener acceso a la clase de las constantes
        var mApp = AppConstants()

        //Si toca la imagen del gato
        iv_cat.setOnClickListener {
            //Guarda el id del gato
            mApp.characterKid = iv_cat.id

            //Realiza el intent a la otra primera pregunta
            val intentQuestion1 = Intent(this@CharacterActivity,Question1::class.java)
            startActivity(intentQuestion1)
        }

        //Si toca la imagen del perro, guarda el id del perro
        iv_dog.setOnClickListener {
            mApp.characterKid = iv_dog.id

            //Realiza el intent a la otra primera pregunta
            val intentQuestion1 = Intent(this@CharacterActivity,Question1::class.java)
            startActivity(intentQuestion1)
        }

        //Si toca la imagen del dinosaurio, guarda el id del dinosaurio
        iv_dinosaur.setOnClickListener {
            mApp.characterKid = iv_dinosaur.id

            //Realiza el intent a la otra primera pregunta
            val intentQuestion1 = Intent(this@CharacterActivity,Question1::class.java)
            startActivity(intentQuestion1)
        }

        //Si toca la imagen del pollo, guarda el id del pollo
        iv_chicken.setOnClickListener {
            mApp.characterKid = iv_chicken.id

            //Realiza el intent a la otra primera pregunta
            val intentQuestion1 = Intent(this@CharacterActivity,Question1::class.java)
            startActivity(intentQuestion1)
        }

        //Si toca la imagen del tiburon, guarda el id del tiburon
        iv_chicken.setOnClickListener {
            mApp.characterKid = iv_chicken.id

            //Realiza el intent a la otra primera pregunta
            val intentQuestion1 = Intent(this@CharacterActivity,Question1::class.java)
            startActivity(intentQuestion1)
        }

        //Si toca la imagen del pinguino, guarda el id del pinguino
        iv_penguin.setOnClickListener {
            mApp.characterKid = iv_penguin.id

            //Realiza el intent a la otra primera pregunta
            val intentQuestion1 = Intent(this@CharacterActivity,Question1::class.java)
            startActivity(intentQuestion1)
        }

    }

}