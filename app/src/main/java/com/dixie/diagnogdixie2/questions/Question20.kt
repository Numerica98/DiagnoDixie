package com.dixie.diagnogdixie2.questions

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.dixie.diagnogdixie2.R
import com.dixie.diagnogdixie2.constants.AppConstants
import kotlinx.android.synthetic.main.activity_question20.*


class Question20 : AppCompatActivity() {
    private lateinit var imageCharacter: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question20)

        //Id del imageview a poner la imagen
        imageCharacter = findViewById(R.id.character_20)

        //Setea la imagen del personaje escogido
        if(AppConstants.characterKid == AppConstants.cat){
            imageCharacter.setImageResource(R.drawable.neko)
        } else if(AppConstants.characterKid == AppConstants.dog){
            imageCharacter.setImageResource(R.drawable.dogui)
        } else if(AppConstants.characterKid == AppConstants.dinosaur){
            imageCharacter.setImageResource(R.drawable.rex)
        } else if(AppConstants.characterKid == AppConstants.chiken){
            imageCharacter.setImageResource(R.drawable.pio)
        } else if(AppConstants.characterKid == AppConstants.shark){
            imageCharacter.setImageResource(R.drawable.sharky)
        } else if(AppConstants.characterKid == AppConstants.penguin){
            imageCharacter.setImageResource(R.drawable.pingui)
        }

        //Listener e implementacion de sonido
        val play = findViewById(R.id.btn_play_20) as ImageView
        play.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.t)
            mp.start()
        }

        bt_Question20.setOnClickListener {
            var valor = rg_question20.checkedRadioButtonId

            //Verifica que se halla seleccionado una opcion
            if(valor == -1){
                Toast.makeText(this,getString(R.string.text_validar_siguiente), Toast.LENGTH_LONG).show()
            } else {

                var radioButton = findViewById<RadioButton>(valor)

                val intentQuestion21 = Intent(this@Question20, Question21::class.java)

                if (radioButton == rb_question20_opc2) {
                    AppConstants.score = AppConstants.score + 1
                    startActivity(intentQuestion21)
                } else {
                    startActivity(intentQuestion21)
                }
            }
        }
    }
}
