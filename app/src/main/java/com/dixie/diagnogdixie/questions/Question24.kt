package com.dixie.diagnogdixie.questions

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import androidx.appcompat.app.AppCompatActivity
import com.dixie.diagnogdixie.R
import com.dixie.diagnogdixie.constants.AppConstants
import kotlinx.android.synthetic.main.activity_question24.*

class Question24 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question24)

        //Listener e implementacion de sonido
        val play = findViewById(R.id.btn_play_24) as Button
        play.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.d)
            mp.start()
        }

        bt_Question24.setOnClickListener {
            var valor = rg_question24.checkedRadioButtonId

            var radioButton = findViewById<RadioButton>(valor)

            val intentQuestion25 = Intent(this@Question24, Question25::class.java)

            if(radioButton == rb_question24_opc2){
                AppConstants.score = AppConstants.score +1
                startActivity(intentQuestion25)
            }else{
                startActivity(intentQuestion25)
            }

        }
    }
}