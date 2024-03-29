package com.dixie.diagnogdixie2.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import com.dixie.diagnogdixie2.constants.AppConstants
import com.dixie.diagnogdixie2.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Accion del boton Next
        bt_Next.setOnClickListener {
            //Si el cuadro de texto viene vacio, no deja seguir y manda un aviso
            if(TextUtils.isEmpty(ed_PaswwordUser.text)){
                Toast.makeText(this,"Debe ingresar un password para iniciar", Toast.LENGTH_LONG).show()
            } else if (TextUtils.isEmpty(ed_EdadKid.text)){
            Toast.makeText(this,"Debe ingresar una edad para iniciar", Toast.LENGTH_LONG).show()
            }
            else{
                //Variable para convertir la edad a entero
                var edadObtenida: Int = ed_EdadKid.text.toString().toInt()

                //Toma el valor de la caja de texto y lo guarda en la variable
                AppConstants.passwordUser = ed_PaswwordUser.text.toString()
                AppConstants.ageKid = edadObtenida

                //Realiza el intent a la siguiente clase
                val intentCharacter= Intent(this@MainActivity, CharacterActivity::class.java)
                startActivity(intentCharacter)
            }
        }


    }
}
