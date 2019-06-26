package com.dixie.diagnogdixie.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import com.dixie.diagnogdixie.constants.AppConstants
import com.dixie.diagnogdixie.R

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
            } else if (!TextUtils.isEmpty(ed_EdadKid.text)){

                //Variable para convertir la edad a entero
                var edadObtenida: Int = ed_EdadKid.text.toString().toInt()

                //verifica que la edad este en el rango de uso esperado
                if (edadObtenida >= 6 && edadObtenida <= 12) {

                    //Toma el valor de la caja de texto y lo guarda en la variable
                    AppConstants.passwordUser = ed_PaswwordUser.text.toString()
                    AppConstants.ageKid = edadObtenida

                    //Realiza el intent a la siguiente clase
                    val intentCharacter= Intent(this@MainActivity, CharacterActivity::class.java)
                    startActivity(intentCharacter)

                } else {
                    Toast.makeText(this,"La edad debe estar entre 6 y 12 años para iniciar", Toast.LENGTH_LONG).show()
                }
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
