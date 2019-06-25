package com.dixie.diagnogdixie.questions

import android.content.Intent
import android.os.Bundle
import android.widget.RadioButton
import androidx.appcompat.app.AppCompatActivity
import com.dixie.diagnogdixie.R
import com.dixie.diagnogdixie.constants.AppConstants
import kotlinx.android.synthetic.main.activity_question32.*

class Question32 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question32)

        bt_Question32.setOnClickListener {
            var valor = rg_question32.checkedRadioButtonId

            var radioButton = findViewById<RadioButton>(valor)

            val intentQuestion33 = Intent(this@Question32, Question35::class.java)

            if(radioButton == rb_question32_opc2){
                AppConstants.score = AppConstants.score +1
                startActivity(intentQuestion33)
            }else{
                startActivity(intentQuestion33)
            }

        }
    }
}