package com.dixie.diagnogdixie.questions

import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import androidx.appcompat.app.AppCompatActivity
import com.dixie.diagnogdixie.R
import com.dixie.diagnogdixie.constants.AppConstants
import kotlinx.android.synthetic.main.activity_question21.*

class Question21 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question21)

        //Listener e implementacion de sonido
        val play = findViewById(R.id.btn_play_21) as Button
        play.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.d)
            mp.start()
        }

        bt_Question21.setOnClickListener {
            var valor = rg_question21.checkedRadioButtonId

            var radioButton = findViewById<RadioButton>(valor)

            val intentQuestion22 = Intent(this@Question21, Question22::class.java)

            if(radioButton == rb_question21_opc3){
                AppConstants.score = AppConstants.score +1
                startActivity(intentQuestion22)
            }else{
                startActivity(intentQuestion22)
            }

        }
    }
}