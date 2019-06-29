package com.dixie.diagnogdixie.questions

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.Toast
import com.dixie.diagnogdixie.R
import com.dixie.diagnogdixie.constants.AppConstants
import kotlinx.android.synthetic.main.activity_question19.*

class Question19 : AppCompatActivity() {

    private lateinit var imageCharacter: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question19)

        //Id del imageview a poner la imagen
        imageCharacter = findViewById(R.id.character_19)

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
        val play = findViewById(R.id.btn_play_19) as ImageView
        play.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.p)
            mp.start()
        }

        bt_Question19.setOnClickListener {
            var valor = rg_question19.checkedRadioButtonId

            //Verifica que se halla seleccionado una opcion
            if(valor == -1){
                Toast.makeText(this,getString(R.string.text_validar_siguiente), Toast.LENGTH_LONG).show()
            } else {

                var radioButton = findViewById<RadioButton>(valor)

                val intentQuestion20 = Intent(this@Question19, Question20::class.java)

                if (radioButton == rb_question19_opc1) {
                    AppConstants.score = AppConstants.score + 1
                    startActivity(intentQuestion20)
                } else {
                    startActivity(intentQuestion20)
                }
            }
        }
    }
}
