package com.dixie.diagnogdixie.questions

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import com.dixie.diagnogdixie.R
import com.dixie.diagnogdixie.constants.AppConstants
import kotlinx.android.synthetic.main.activity_question30.*

class Question30 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question30)

        bt_Question30.setOnClickListener {
            var valor = rg_question30.checkedRadioButtonId

            var radioButton = findViewById<RadioButton>(valor)

            val intentQuestion31 = Intent(this@Question30, Question31::class.java)

            if(radioButton == rb_question30_opc1){
                AppConstants.score = AppConstants.score +1
                startActivity(intentQuestion31)
            }else{
                startActivity(intentQuestion31)
            }

        }
    }
}
