package com.example.prueba.questions

import android.content.Intent
import android.os.Bundle
import android.widget.RadioButton
import androidx.appcompat.app.AppCompatActivity
import com.example.prueba.R
import com.example.prueba.constants.AppConstants
import kotlinx.android.synthetic.main.activity_question24.*

class Question24 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question24)

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