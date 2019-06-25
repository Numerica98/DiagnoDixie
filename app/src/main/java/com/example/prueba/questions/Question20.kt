package com.example.prueba.questions

import android.content.Intent
import android.os.Bundle
import android.widget.RadioButton
import androidx.appcompat.app.AppCompatActivity
import com.example.prueba.R
import com.example.prueba.activities.FinishActivity
import com.example.prueba.constants.AppConstants

import kotlinx.android.synthetic.main.activity_question20.*


class Question20 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question20)

        bt_Question20.setOnClickListener {
            var valor = rg_question20.checkedRadioButtonId

            var radioButton = findViewById<RadioButton>(valor)

            val intentFinish = Intent(this@Question20, FinishActivity::class.java)

            if(radioButton == rb_question20_opc2){
                AppConstants.score = AppConstants.score +1
                startActivity(intentFinish)
            }else{
                startActivity(intentFinish)
            }

        }
    }
}
