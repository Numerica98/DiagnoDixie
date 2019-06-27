package com.dixie.diagnogdixie.questions

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.dixie.diagnogdixie.R
import com.dixie.diagnogdixie.constants.AppConstants
import kotlinx.android.synthetic.main.activity_question26.*

class Question26 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question26)

        //Listener e implementacion de sonido
        val play = findViewById(R.id.btn_play_26) as Button
        play.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.t)
            mp.start()
        }

        bt_Question26.setOnClickListener {
            var valor = rg_question26.checkedRadioButtonId

            //Verifica que se halla seleccionado una opcion
            if(valor == -1){
                Toast.makeText(this,getString(R.string.text_validar_siguiente), Toast.LENGTH_LONG).show()
            } else {

                var radioButton = findViewById<RadioButton>(valor)

                val intentQuestion28 = Intent(this@Question26, Question28::class.java)

                if (radioButton == rb_question26_opc2) {
                    AppConstants.score = AppConstants.score + 1
                    startActivity(intentQuestion28)
                } else {
                    startActivity(intentQuestion28)
                }
            }
        }
    }
}