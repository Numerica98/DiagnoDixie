package com.example.prueba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_question19.*

class Question19 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question19)

        bt_Question19.setOnClickListener {
            var valor = rg_question19.checkedRadioButtonId

            var radioButton = findViewById<RadioButton>(valor)

            val intentFinish = Intent(this@Question19, FinishActivity::class.java)

            if(radioButton == rb_question19_opc1){
                AppConstants.score = AppConstants.score +1
                startActivity(intentFinish)
            }else{
                startActivity(intentFinish)
            }

        }
    }
}
