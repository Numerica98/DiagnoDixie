package com.dixie.diagnogdixie.questions

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.Toast
import com.dixie.diagnogdixie.R
import com.dixie.diagnogdixie.constants.AppConstants
import kotlinx.android.synthetic.main.activity_question28.*

class Question28 : AppCompatActivity() {
    private lateinit var imageCharacter: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question28)


        //Id del imageview a poner la imagen
        imageCharacter = findViewById(R.id.character_28)

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


        bt_Question28.setOnClickListener {
            var valor = rg_question28.checkedRadioButtonId

            //Verifica que se halla seleccionado una opcion
            if(valor == -1){
                Toast.makeText(this,getString(R.string.text_validar_siguiente), Toast.LENGTH_LONG).show()
            } else {

                var radioButton = findViewById<RadioButton>(valor)

                val intentQuestion30 = Intent(this@Question28, Question30::class.java)

                if (radioButton == rb_question28_opc1) {
                    AppConstants.score = AppConstants.score + 1
                    startActivity(intentQuestion30)
                } else {
                    startActivity(intentQuestion30)
                }
            }
        }
    }
}
