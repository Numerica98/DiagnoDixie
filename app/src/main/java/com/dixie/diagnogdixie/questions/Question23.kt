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
import kotlinx.android.synthetic.main.activity_question23.*

class Question23 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question23)

        //Listener e implementacion de sonido
        val play = findViewById(R.id.btn_play_23) as Button
        play.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.f)
            mp.stop()
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