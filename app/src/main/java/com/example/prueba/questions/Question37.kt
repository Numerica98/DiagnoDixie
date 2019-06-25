package com.example.prueba.questions

import android.content.Intent
import android.os.Bundle
import android.widget.RadioButton
import androidx.appcompat.app.AppCompatActivity
import com.example.prueba.R
import com.example.prueba.constants.AppConstants
import kotlinx.android.synthetic.main.activity_question37.*

class Question37 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question37)

        bt_Question37.setOnClickListener {
            var valor = rg_question37.checkedRadioButtonId

            var radioButton = findViewById<RadioButton>(valor)

            val intentQuestion39 = Intent(this@Question37, Question39::class.java)

            if(radioButton == rb_question37_opc1){
                AppConstants.score = AppConstants.score +1
                startActivity(intentQuestion39)
            }else{
                startActivity(intentQuestion39)
            }

        }
    }
}