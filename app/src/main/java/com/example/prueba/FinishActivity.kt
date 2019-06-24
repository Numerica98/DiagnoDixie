package com.example.prueba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        var mApp = AppConstants()

        //iv_characterSelected.setImageDrawable(mApp.getDrawable(mApp.characterKid))

        bt_NextResult.setOnClickListener {
            if(TextUtils.isEmpty(ed_PaswwordUserConfirm.text)){
                Toast.makeText(this,"Ingrese el password para saber el resultado", Toast.LENGTH_LONG).show()
            }else{
                if(ed_PaswwordUserConfirm.text.toString() != mApp.passwordUser){
                    Toast.makeText(this,"Ingrese el password correcto", Toast.LENGTH_LONG).show()
                }else{
                    val intentResult = Intent(this@FinishActivity, ResultActivity::class.java)
                    startActivity(intentResult)
                }
            }
        }
    }
}
