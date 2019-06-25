package com.example.prueba.questions

import android.content.Intent
import android.os.Bundle
import android.widget.RadioButton
import androidx.appcompat.app.AppCompatActivity
import com.example.prueba.R
import com.example.prueba.constants.AppConstants
import kotlinx.android.synthetic.main.activity_question22.*

class Question22 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question22)

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