package com.example.prueba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import com.example.prueba.AppConstants

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Variable para tener acceso a la clase de las constantes
        var mApp = AppConstants()

        //Accion del boton Next
        bt_Next.setOnClickListener {
            //Si el cuadro de texto viene vacio, no deja seguir y manda un aviso
            if(TextUtils.isEmpty(ed_PaswwordUser.text)){
                Toast.makeText(this,"Debe ingresar un password para iniciar", Toast.LENGTH_LONG).show()
            }else{
                //Toma el valor de la caja de texto y lo guarda en la variable
                mApp.passwordUser = ed_PaswwordUser.text.toString()

                //Realiza el intent a la siguiente clase
                val intentCharacter= Intent(this@MainActivity, CharacterActivity::class.java)
                startActivity(intentCharacter)
            }
        }


    }
}
