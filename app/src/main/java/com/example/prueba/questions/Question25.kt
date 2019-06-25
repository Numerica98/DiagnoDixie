package com.example.prueba.questions

import android.content.Intent
import android.os.Bundle
import android.widget.RadioButton
import androidx.appcompat.app.AppCompatActivity
import com.example.prueba.R
import com.example.prueba.constants.AppConstants
import kotlinx.android.synthetic.main.activity_question25.*

class Question25 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question25)

        bt_Question25.setOnClickListener {
            var valor = rg_question25.checkedRadioButtonId

            var radioButton = findViewById<RadioButton>(valor)

            val intentQuestion26 = Intent(this@Question25, Question26::class.java)

            if(radioButton == rb_question25_opc2){
                AppConstants.score = AppConstants.score +1
                startActivity(intentQuestion26)
            }else{
                startActivity(intentQuestion26)
            }

        }
    }
}