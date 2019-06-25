package com.example.prueba.questions

import android.content.Intent
import android.os.Bundle
import android.widget.RadioButton
import androidx.appcompat.app.AppCompatActivity
import com.example.prueba.R
import com.example.prueba.constants.AppConstants
import kotlinx.android.synthetic.main.activity_question21.*

class Question21 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question21)

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