package com.dixie.diagnogdixie.questions

import android.content.Intent
import android.os.Bundle
import android.widget.RadioButton
import androidx.appcompat.app.AppCompatActivity
import com.dixie.diagnogdixie.R
import com.dixie.diagnogdixie.constants.AppConstants
import kotlinx.android.synthetic.main.activity_question35.*

class Question35 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question35)

        bt_Question35.setOnClickListener {
            var valor = rg_question35.checkedRadioButtonId

            var radioButton = findViewById<RadioButton>(valor)

            val intentQuestion37 = Intent(this@Question35, Question37::class.java)

            if(radioButton == rb_question35_opc1){
                AppConstants.score = AppConstants.score +1
                startActivity(intentQuestion37)
            }else{
                startActivity(intentQuestion37)
            }

        }
    }
}