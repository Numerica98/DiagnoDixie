package com.dixie.diagnogdixie.questions

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RadioButton
import com.dixie.diagnogdixie.R
import com.dixie.diagnogdixie.activities.FinishActivity
import com.dixie.diagnogdixie.constants.AppConstants
import kotlinx.android.synthetic.main.activity_question19.*

class Question19 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question19)

        //Listener e implementacion de sonido
        val play = findViewById(R.id.btn_play_19) as Button
        play.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.p)
            mp.start()
            mp.stop()
        }

        bt_Question19.setOnClickListener {
            var valor = rg_question19.checkedRadioButtonId

            var radioButton = findViewById<RadioButton>(valor)

            val intentQuestion20 = Intent(this@Question19, Question20::class.java)

            if(radioButton == rb_question19_opc1){
                AppConstants.score = AppConstants.score +1
                startActivity(intentQuestion20)
            }else{
                startActivity(intentQuestion20)
            }

        }
    }
}
