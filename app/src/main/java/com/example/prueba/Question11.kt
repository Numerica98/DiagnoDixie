package com.example.prueba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import kotlinx.android.synthetic.main.activity_question11.*

class Question11 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question11)

        var mApp = AppConstants()

        bt_Question11.setOnClickListener {
            var valor = rg_question11.checkedRadioButtonId
            var radioButton = findViewById<RadioButton>(valor)

            val intentFinish = Intent(this@Question11,FinishActivity::class.java)

            if(radioButton == rb_question11_opc1){
                mApp.score = mApp.score +1
                startActivity(intentFinish)
            }else {
                startActivity(intentFinish)
            }
        }
    }
}
