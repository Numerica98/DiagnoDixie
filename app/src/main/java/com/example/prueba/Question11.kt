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

        //Accion del boton
        bt_Question11.setOnClickListener {
            //Obtiene el radioButton selecionado
            var valor = rg_question11.checkedRadioButtonId

            //Obtiene el id de los RadioButton pertenecientes al RadioGroup
            var radioButton = findViewById<RadioButton>(valor)

            //Variable para realizar el intent mas adelante
            val intentFinish = Intent(this@Question11,Question19::class.java)

            //Verifica si el radioButton selecionado es el de la respuesta correcta
            if(radioButton == rb_question11_opc1){
                //Aumenta el puntaje e inicia la siguiente actividad
                AppConstants.score = AppConstants.score +1
                startActivity(intentFinish)
            }else {
                //Inicia la siguiente actividad
                startActivity(intentFinish)
            }
        }
    }
}
