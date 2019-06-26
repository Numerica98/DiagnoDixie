package com.dixie.diagnogdixie.questions

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import androidx.appcompat.app.AppCompatActivity
import com.dixie.diagnogdixie.R
import com.dixie.diagnogdixie.constants.AppConstants
import kotlinx.android.synthetic.main.activity_question22.*

class Question22 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question22)

        //Listener e implementacion de sonido
        val play = findViewById(R.id.btn_play_22) as Button
        play.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.e)
            mp.start()
        }

        bt_Question22.setOnClickListener {
            var valor = rg_question22.checkedRadioButtonId

            var radioButton = findViewById<RadioButton>(valor)

            val intentQuestion23 = Intent(this@Question22, Question23::class.java)

            if(radioButton == rb_question22_opc2){
                AppConstants.score = AppConstants.score +1
                startActivity(intentQuestion23)
            }else{
                startActivity(intentQuestion23)
            }

        }
    }
}