package com.example.prueba

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_question1.*

class Question1 : AppCompatActivity() {
    //Contadores para controlar si se selecciona el item mas de una vez
    var touchTextView1: Int = 0
    var touchTextView2: Int = 0
    var touchTextView3: Int = 0
    var touchTextView4: Int = 0
    var touchTextView5: Int = 0
    var touchTextView6: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question1)

        //Variable para tener acceso a la clase de las constantes
        var mApp = AppConstants()

        tv_g_0_0.setOnClickListener {
            //Aumenta el contador cada vez que se presiona
            touchTextView1 = touchTextView1 +1

            //Verifica si es un numero impar para cambiar el color de seleccion
            if(touchTextView1 % 2 !=0){
                tv_g_0_0.setBackgroundColor(resources.getColor(R.color.itemSelect))
            }else {
              //En caso de ser par se coloca el color original
                tv_g_0_0.setBackgroundColor(resources.getColor(R.color.colorWhite))
            }
        }
    }
}
