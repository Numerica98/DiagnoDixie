package com.dixie.diagnogdixie.questions

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.dixie.diagnogdixie.R
import com.dixie.diagnogdixie.constants.AppConstants
import kotlinx.android.synthetic.main.activity_question37.*

class Question37 : AppCompatActivity() {
    private lateinit var imageCharacter: ImageView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question37)

        bt_Question37.setOnClickListener {
            var valor = rg_question37.checkedRadioButtonId
            //Id del imageview a poner la imagen
            imageCharacter = findViewById(R.id.character_37)

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


            //Verifica que se halla seleccionado una opcion
            if(valor == -1){
                Toast.makeText(this,getString(R.string.text_validar_siguiente), Toast.LENGTH_LONG).show()
            } else {

                var radioButton = findViewById<RadioButton>(valor)

                val intentQuestion39 = Intent(this@Question37, Question39::class.java)

                if (radioButton == rb_question37_opc1) {
                    AppConstants.score = AppConstants.score + 1
                    startActivity(intentQuestion39)
                } else {
                    startActivity(intentQuestion39)
                }
            }
        }
    }
}