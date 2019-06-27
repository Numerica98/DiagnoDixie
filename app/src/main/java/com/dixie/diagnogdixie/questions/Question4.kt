package com.dixie.diagnogdixie.questions

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.dixie.diagnogdixie.R
import com.dixie.diagnogdixie.constants.AppConstants
import kotlinx.android.synthetic.main.activity_question4.*

class Question4 : AppCompatActivity() {
    //Contadores para controlar si se selecciona el item mas de una vez
    var touchTextView1: Int = 0
    var touchTextView2: Int = 0
    var touchTextView3: Int = 0
    var touchTextView4: Int = 0
    var touchTextView5: Int = 0
    var touchTextView6: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question4)

        //Listener e implementacion de sonido
        val play = findViewById(R.id.btn_play_4) as Button
        play.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.b)
            mp.start()
        }

        //Variable para generar el intent mas adelante
        val intentQuestion5 = Intent(this@Question4, Question5::class.java)

        tv_question4_d_0_0.setOnClickListener {
            //Aumenta el contador cada vez que se presiona
            touchTextView1 = touchTextView1 +1

            //Verifica si es un numero impar para cambiar el color de seleccion
            if(touchTextView1 % 2 !=0){
                tv_question4_d_0_0.setBackgroundResource(R.color.itemSelect)
            }else {
                //En caso de ser par se coloca el color original
                tv_question4_d_0_0.setBackgroundResource(R.color.colorWhite)
            }
        }

        tv_question4_b_0_1.setOnClickListener {
            //Aumenta el contador cada vez que se presiona
            touchTextView2 = touchTextView2 +1

            //Verifica si es un numero impar para cambiar el color de seleccion
            if(touchTextView2 % 2 !=0){
                tv_question4_b_0_1.setBackgroundResource(R.color.itemSelect)
            }else {
                //En caso de ser par se coloca el color original
                tv_question4_b_0_1.setBackgroundResource(R.color.colorWhite)
            }
        }

        tv_question4_p_1_0.setOnClickListener {
            //Aumenta el contador cada vez que se presiona
            touchTextView3 = touchTextView3 +1

            //Verifica si es un numero impar para cambiar el color de seleccion
            if(touchTextView3 % 2 !=0){
                tv_question4_p_1_0.setBackgroundResource(R.color.itemSelect)
            }else {
                //En caso de ser par se coloca el color original
                tv_question4_p_1_0.setBackgroundResource(R.color.colorWhite)
            }
        }

        tv_question4_d_1_1.setOnClickListener {
            //Aumenta el contador cada vez que se presiona
            touchTextView4 = touchTextView4 +1

            //Verifica si es un numero impar para cambiar el color de seleccion
            if(touchTextView4 % 2 !=0){
                tv_question4_d_1_1.setBackgroundResource(R.color.itemSelect)
            }else {
                //En caso de ser par se coloca el color original
                tv_question4_d_1_1.setBackgroundResource(R.color.colorWhite)
            }
        }

        tv_question4_d_2_0.setOnClickListener {
            //Aumenta el contador cada vez que se presiona
            touchTextView5 = touchTextView5 +1

            //Verifica si es un numero impar para cambiar el color de seleccion
            if(touchTextView5 % 2 !=0){
                tv_question4_d_2_0.setBackgroundResource(R.color.itemSelect)
            }else {
                //En caso de ser par se coloca el color original
                tv_question4_d_2_0.setBackgroundResource(R.color.colorWhite)
            }
        }

        tv_question4_b_2_1.setOnClickListener {
            //Aumenta el contador cada vez que se presiona
            touchTextView6 = touchTextView6 +1

            //Verifica si es un numero impar para cambiar el color de seleccion
            if(touchTextView6 % 2 !=0){
                tv_question4_b_2_1.setBackgroundResource(R.color.itemSelect)
            }else {
                //En caso de ser par se coloca el color original
                tv_question4_b_2_1.setBackgroundResource(R.color.colorWhite)
            }
        }

        bt_Question4.setOnClickListener {
            //Verifica si NO se ha seleccionado un item
            if(touchTextView1 % 2 == 0 && touchTextView2 % 2 == 0 && touchTextView3 % 2 == 0
                    && touchTextView4 % 2 == 0 && touchTextView5 % 2 == 0 && touchTextView6 % 2 == 0){
                Toast.makeText(this,getString(R.string.text_validar_siguiente), Toast.LENGTH_LONG).show()
            }

            //Verifica que esten seleccionados los items correctos
            else if((touchTextView2 % 2 != 0 || touchTextView6 % 2 != 0) //Que solo uno de los tres este seleccionado
                    ||
                    (touchTextView2 % 2 != 0 && touchTextView6 % 2 != 0) //Que todos los items correctos esten seleccionados
            ){
                //Aumenta el puntaje del nino
                AppConstants.score = AppConstants.score +1

                //Realiza el intent para ir a la segunda pregunta
                startActivity(intentQuestion5)

            }else {
                startActivity(intentQuestion5)
            }
        }
    }
}
