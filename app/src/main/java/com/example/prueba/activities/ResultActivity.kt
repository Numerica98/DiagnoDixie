package com.example.prueba.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.prueba.constants.AppConstants
import com.example.prueba.R
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        //Coloca el valor del puntaje
        tv_AnswerCountDetail.setText(AppConstants.score.toString())

        //Dependiendo del puntaje obtenido en la prueba, coloca el diagnostico
        if(AppConstants.score >= 16){
            tv_RecomendationDetail.setText("El/la menor no presenta la condicion")
        }else {
            tv_RecomendationDetail.setText("El/la menor necesita una evaluacion para apoyar su proceso lector")
        }

        //Accion del boton
        bt_NextFinish.setOnClickListener {
            //Restaura los valores globales a su valor inicial
            AppConstants.passwordUser = ""
            AppConstants.characterKid = 0
            AppConstants.score = 0
            AppConstants.cat = 0
            AppConstants.dog = 0
            AppConstants.dinosaur = 0
            AppConstants.chiken = 0
            AppConstants.shark = 0
            AppConstants.penguin = 0

            //Envia a la pantalla principal
            val intentMain = Intent(this@ResultActivity, MainActivity::class.java)
            startActivity(intentMain)
        }

    }
}
