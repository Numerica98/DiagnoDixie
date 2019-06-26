package com.dixie.diagnogdixie.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dixie.diagnogdixie.constants.AppConstants
import com.dixie.diagnogdixie.R
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    //Variables para determinar el rango de edad al que pertenece el menor
    var edadPromedioCondicion = 6..9
    var edadPromedioTempranaACondicion = 4..6

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        //Coloca el valor del puntaje
        tv_AnswerCountDetail.setText(AppConstants.score.toString())

        //Dependiendo del puntaje obtenido en la prueba y su edad, coloca el diagnostico
        if(AppConstants.score >= 16 && (AppConstants.ageKid in edadPromedioCondicion)){
            tv_RecomendationDetail.setText("El/la menor no presenta la condicion")
        } else if(AppConstants.score < 16 && (AppConstants.ageKid in edadPromedioTempranaACondicion)){
            tv_RecomendationDetail.setText("El/la menor tiene una edad muy temprana para definir si presenta o no la condicion")
        }
        else if(AppConstants.score < 16 && (AppConstants.ageKid in edadPromedioCondicion)){
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