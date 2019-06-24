package com.example.prueba

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        //Variable para acceder a la constante
        var mApp = AppConstants()

        //Coloca el valor del puntaje
        tv_AnswerCountDetail.setText(mApp.score.toString())

        //Dependiendo del puntaje obtenido en la prueba, coloca el diagnostico
        if(mApp.score >= 2){
            tv_RecomendationDetail.setText("El/la menor no presenta la condicion")
        }else {
            tv_RecomendationDetail.setText("El/la menor necesita una evaluacion para apoyar su proceso lector")
        }

        //Accion del boton
        bt_NextFinish.setOnClickListener {
            //Restaura los valores globales a su valor inicial
            mApp.passwordUser = ""
            mApp.characterKid = 0
            mApp.score = 0

            //Envia a la pantalla principal
            val intentMain = Intent(this@ResultActivity, MainActivity::class.java)
            startActivity(intentMain)
        }

    }
}
