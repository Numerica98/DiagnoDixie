package com.dixie.diagnogdixie.questions

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.dixie.diagnogdixie.R
import com.dixie.diagnogdixie.constants.AppConstants
import kotlinx.android.synthetic.main.activity_question23.*

class Question23 : AppCompatActivity() {
    private lateinit var imageCharacter: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question23)

        //Id del imageview a poner la imagen
        imageCharacter = findViewById(R.id.character_23)

        //Setea la imagen del personaje escogido, un sonido y mensaje
        if(AppConstants.characterKid == AppConstants.cat){
            imageCharacter.setImageResource(R.drawable.neko)
            val mpNeko = MediaPlayer.create(this, R.raw.neko)
            mpNeko.start()
            Toast.makeText(this, getString(R.string.motivation3), Toast.LENGTH_LONG).show()
        } else if(AppConstants.characterKid == AppConstants.dog){
            imageCharacter.setImageResource(R.drawable.dogui)
            val mpDogui = MediaPlayer.create(this, R.raw.dogui)
            mpDogui.start()
            Toast.makeText(this, getString(R.string.motivation3), Toast.LENGTH_LONG).show()
        } else if(AppConstants.characterKid == AppConstants.dinosaur){
            imageCharacter.setImageResource(R.drawable.rex)
            val mpRex = MediaPlayer.create(this, R.raw.rex)
            mpRex.start()
            Toast.makeText(this, getString(R.string.motivation3), Toast.LENGTH_LONG).show()
        } else if(AppConstants.characterKid == AppConstants.chiken){
            imageCharacter.setImageResource(R.drawable.pio)
            val mpPio = MediaPlayer.create(this, R.raw.pio)
            mpPio.start()
            Toast.makeText(this, getString(R.string.motivation3), Toast.LENGTH_LONG).show()
        } else if(AppConstants.characterKid == AppConstants.shark){
            imageCharacter.setImageResource(R.drawable.sharky)
            val mpSharky = MediaPlayer.create(this, R.raw.sharky)
            mpSharky.start()
            Toast.makeText(this, getString(R.string.motivation3), Toast.LENGTH_LONG).show()
        } else if(AppConstants.characterKid == AppConstants.penguin){
            imageCharacter.setImageResource(R.drawable.pingui)
            val mpPingui = MediaPlayer.create(this, R.raw.pingui)
            mpPingui.start()
            Toast.makeText(this, getString(R.string.motivation3), Toast.LENGTH_LONG).show()
        }

        //Listener e implementacion de sonido
        val play = findViewById(R.id.btn_play_23) as ImageView
        play.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.f)
            mp.start()
        }

        bt_Question23.setOnClickListener {
            var valor = rg_question23.checkedRadioButtonId

            //Verifica que se halla seleccionado una opcion
            if(valor == -1){
                Toast.makeText(this,getString(R.string.text_validar_siguiente), Toast.LENGTH_LONG).show()
            } else {

                var radioButton = findViewById<RadioButton>(valor)

                val intentQuestion24 = Intent(this@Question23, Question24::class.java)

                if (radioButton == rb_question23_opc1) {
                    AppConstants.score = AppConstants.score + 1
                    startActivity(intentQuestion24)
                } else {
                    startActivity(intentQuestion24)
                }
            }
        }
    }
}