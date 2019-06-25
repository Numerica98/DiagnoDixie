package com.example.prueba.questions

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import com.example.prueba.R
import com.example.prueba.activities.FinishActivity
import com.example.prueba.constants.AppConstants
import kotlinx.android.synthetic.main.activity_question19.*

class Question19 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question19)

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
