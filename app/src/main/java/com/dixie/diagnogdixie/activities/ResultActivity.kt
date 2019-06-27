package com.dixie.diagnogdixie.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dixie.diagnogdixie.constants.AppConstants
import com.dixie.diagnogdixie.R
import kotlinx.android.synthetic.main.activity_result.*

class ResultActivity : AppCompatActivity() {
    //Variables para determinar el rango de edad al que pertenece el menor
    var edadPromedioTempranaACondicion = 1..5
    var edadRango1 = 6..7
    var edadRango2 = 8..9
    var edadRango3 = 10..12

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        //Coloca el valor del puntaje
        tv_AnswerCountDetail.setText(AppConstants.score.toString())

        //Dependiendo del puntaje obtenido en la prueba y su edad, coloca el diagnostico
        if(AppConstants.score <=13 && (AppConstants.ageKid in edadRango1)){
            tv_RecomendationDetail.setText(getString(R.string.text_condicion))
        } else if(AppConstants.score > 13 && (AppConstants.ageKid in edadRango1)){
            tv_RecomendationDetail.setText(getString(R.string.text_no_condicion))
        } else if(AppConstants.score <= 10 && (AppConstants.ageKid in edadRango2)){
            tv_RecomendationDetail.setText(R.string.text_condicion)
        } else if(AppConstants.score > 10 && (AppConstants.ageKid in edadRango2)){
            tv_RecomendationDetail.setText(R.string.text_no_condicion)
        } else if(AppConstants.score <= 3 && (AppConstants.ageKid in edadRango3)){
            tv_RecomendationDetail.setText(R.string.text_condicion)
        } else if(AppConstants.score > 3 && (AppConstants.ageKid in edadRango3)){
            tv_RecomendationDetail.setText(R.string.text_no_condicion)
        } else if(AppConstants.score < 16 && (AppConstants.ageKid in edadPromedioTempranaACondicion)){
            tv_RecomendationDetail.setText(getString(R.string.text_codicion_indefinida))
        } else if(AppConstants.score >= 16 && (AppConstants.ageKid in edadPromedioTempranaACondicion)){
            tv_RecomendationDetail.setText(R.string.text_no_condicion)
        } else if(AppConstants.score <= 3 && (AppConstants.ageKid >12)){
            tv_RecomendationDetail.setText(R.string.text_condicion_mayor)
        } else if(AppConstants.score > 3 && (AppConstants.ageKid >12)){
            tv_RecomendationDetail.setText(R.string.text_no_condicion_mayor)
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
