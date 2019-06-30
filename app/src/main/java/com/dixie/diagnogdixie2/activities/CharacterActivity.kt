package com.dixie.diagnogdixie2.activities

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dixie.diagnogdixie2.constants.AppConstants
import com.dixie.diagnogdixie2.questions.Question1
import com.dixie.diagnogdixie2.R
import kotlinx.android.synthetic.main.activity_character.*

class CharacterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_character)

        //Se guardan los id de cada personaje
        AppConstants.cat = iv_cat.id
        AppConstants.dog = iv_dog.id
        AppConstants.dinosaur = iv_dinosaur.id
        AppConstants.chiken = iv_chicken.id
        AppConstants.shark = iv_shark.id
        AppConstants.penguin = iv_penguin.id

        //Si toca la imagen del gato
        iv_cat.setOnClickListener {
            //Guarda el id del gato
            AppConstants.characterKid = iv_cat.id

            //Genera el sonido del personaje
            val mpNeko = MediaPlayer.create(this, R.raw.neko)
            mpNeko.start()

            //Realiza el intent a la otra primera pregunta
            val intentQuestion1 = Intent(this@CharacterActivity, Question1::class.java)
            startActivity(intentQuestion1)
        }

        //Si toca la imagen del perro, guarda el id del perro
        iv_dog.setOnClickListener {
            AppConstants.characterKid = iv_dog.id

            //Genera el sonido del personaje
            val mpDogui = MediaPlayer.create(this, R.raw.dogui)
            mpDogui.start()

            //Realiza el intent a la otra primera pregunta
            val intentQuestion1 = Intent(this@CharacterActivity, Question1::class.java)
            startActivity(intentQuestion1)
        }

        //Si toca la imagen del dinosaurio, guarda el id del dinosaurio
        iv_dinosaur.setOnClickListener {
            AppConstants.characterKid = iv_dinosaur.id

            //Genera el sonido del personaje
            val mpRex = MediaPlayer.create(this, R.raw.rex)
            mpRex.start()

            //Realiza el intent a la otra primera pregunta
            val intentQuestion1 = Intent(this@CharacterActivity, Question1::class.java)
            startActivity(intentQuestion1)
        }

        //Si toca la imagen del pollo, guarda el id del pollo
        iv_chicken.setOnClickListener {
            AppConstants.characterKid = iv_chicken.id

            //Genera el sonido del personaje
            val mpPio = MediaPlayer.create(this, R.raw.pio)
            mpPio.start()

            //Realiza el intent a la otra primera pregunta
            val intentQuestion1 = Intent(this@CharacterActivity, Question1::class.java)
            startActivity(intentQuestion1)
        }

        //Si toca la imagen del tiburon, guarda el id del tiburon
        iv_shark.setOnClickListener {
            AppConstants.characterKid = iv_shark.id

            //Genera el sonido del personaje
            val mpSharky = MediaPlayer.create(this, R.raw.sharky)
            mpSharky.start()

            //Realiza el intent a la otra primera pregunta
            val intentQuestion1 = Intent(this@CharacterActivity, Question1::class.java)
            startActivity(intentQuestion1)
        }

        //Si toca la imagen del pinguino, guarda el id del pinguino
        iv_penguin.setOnClickListener {
            AppConstants.characterKid = iv_penguin.id

            //Genera el sonido del personaje
            val mpPingui = MediaPlayer.create(this, R.raw.pingui)
            mpPingui.start()

            //Realiza el intent a la otra primera pregunta
            val intentQuestion1 = Intent(this@CharacterActivity, Question1::class.java)
            startActivity(intentQuestion1)
        }

    }

}
