package com.dixie.diagnogdixie2.questions

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.dixie.diagnogdixie2.R
import com.dixie.diagnogdixie2.activities.FinishActivity
import com.dixie.diagnogdixie2.constants.AppConstants
import kotlinx.android.synthetic.main.activity_question40.*

class Question40 : AppCompatActivity() {
    private lateinit var imageCharacter: ImageView
    //Contadores para controlar si se selecciona el item mas de una vez
    var touchTextView1: Int = 0
    var touchTextView2: Int = 0
    var touchTextView3: Int = 0
    var touchTextView4: Int = 0
    var touchTextView5: Int = 0
    var touchTextView6: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question40)


        //Id del imageview a poner la imagen
        imageCharacter = findViewById(R.id.character_40)

        //Setea la imagen del personaje escogido
        if(AppConstants.characterKid == AppConstants.cat){
            imageCharacter.setImageResource(R.drawable.neko)
        } else if(AppConstants.characterKid == AppConstants.dog){
            imageCharacter.setImageResource(R.drawable.dogui)
        } else if(AppConstants.characterKid == AppConstants.dinosaur){
            imageCharacter.setImageResource(R.drawable.rex)
        } else if(AppConstants.characterKid == AppConstants.chiken){
            imageCharacter.setImageResource(R.drawable.pio)
        } else if(AppConstants.characterKid == AppConstants.shark){
            imageCharacter.setImageResource(R.drawable.sharky)
        } else if(AppConstants.characterKid == AppConstants.penguin){
            imageCharacter.setImageResource(R.drawable.pingui)
        }

        //Variables de id
        val textView1 = findViewById<TextView>(R.id.tv_question40_queso)
        val textView2 = findViewById<TextView>(R.id.tv_question40_pueso)
        val textView3 = findViewById<TextView>(R.id.tv_question40_pronto)
        val textView4 = findViewById<TextView>(R.id.tv_question40_pornto)
        val textView5 = findViewById<TextView>(R.id.tv_question40_cual)
        val textView6 = findViewById<TextView>(R.id.tv_question40_caul)

        //Variable para generar el intent mas adelante
        val intentFinish = Intent(this@Question40, FinishActivity::class.java)

        textView1.setOnClickListener {
            //Aumenta el contador cada vez que se presiona
            touchTextView1 = touchTextView1 +1

            //Verifica si es un numero impar para cambiar el color de seleccion
            if(touchTextView1 % 2 !=0){
                textView1.setBackgroundResource(R.color.itemSelect)
            }else {
                //En caso de ser par se coloca el color original
                textView1.setBackgroundResource(R.color.colorWhite)
            }
        }

        textView2.setOnClickListener {
            //Aumenta el contador cada vez que se presiona
            touchTextView2 = touchTextView2 +1

            //Verifica si es un numero impar para cambiar el color de seleccion
            if(touchTextView2 % 2 !=0){
                textView2.setBackgroundResource(R.color.itemSelect)
            }else {
                //En caso de ser par se coloca el color original
                textView2.setBackgroundResource(R.color.colorWhite)
            }
        }

        textView3.setOnClickListener {
            //Aumenta el contador cada vez que se presiona
            touchTextView3 = touchTextView3 +1

            //Verifica si es un numero impar para cambiar el color de seleccion
            if(touchTextView3 % 2 !=0){
                textView3.setBackgroundResource(R.color.itemSelect)
            }else {
                //En caso de ser par se coloca el color original
                textView3.setBackgroundResource(R.color.colorWhite)
            }
        }

        textView4.setOnClickListener {
            //Aumenta el contador cada vez que se presiona
            touchTextView4 = touchTextView4 +1

            //Verifica si es un numero impar para cambiar el color de seleccion
            if(touchTextView4 % 2 !=0){
                textView4.setBackgroundResource(R.color.itemSelect)
            }else {
                //En caso de ser par se coloca el color original
                textView4.setBackgroundResource(R.color.colorWhite)
            }
        }

        textView5.setOnClickListener {
            //Aumenta el contador cada vez que se presiona
            touchTextView5 = touchTextView5 +1

            //Verifica si es un numero impar para cambiar el color de seleccion
            if(touchTextView5 % 2 !=0){
                textView5.setBackgroundResource(R.color.itemSelect)
            }else {
                //En caso de ser par se coloca el color original
                textView5.setBackgroundResource(R.color.colorWhite)
            }
        }

        textView6.setOnClickListener {
            //Aumenta el contador cada vez que se presiona
            touchTextView6 = touchTextView6 +1

            //Verifica si es un numero impar para cambiar el color de seleccion
            if(touchTextView6 % 2 !=0){
                textView6.setBackgroundResource(R.color.itemSelect)
            }else {
                //En caso de ser par se coloca el color original
                textView6.setBackgroundResource(R.color.colorWhite)
            }
        }

        bt_Question40.setOnClickListener {
            //Verifica si NO se ha seleccionado un item
            if(touchTextView1 % 2 == 0 && touchTextView2 % 2 == 0 && touchTextView3 % 2 == 0
                    && touchTextView4 % 2 == 0 && touchTextView5 % 2 == 0 && touchTextView6 % 2 == 0){
                Toast.makeText(this,getString(R.string.text_validar_siguiente), Toast.LENGTH_LONG).show()
            }

            //Verifica que esten seleccionados los items correctos
            else if((touchTextView1 % 2 != 0 || touchTextView3 % 2 != 0 || touchTextView5 % 2 != 0) //Que solo uno de los tres este seleccionado
                    ||
                    (touchTextView1 % 2 != 0 && touchTextView3 % 2 != 0 && touchTextView5 % 2 != 0) //Que todos los items correctos esten seleccionados
            ){
                //Aumenta el puntaje del nino
                AppConstants.score = AppConstants.score +1

                //Realiza el intent para ir a la segunda pregunta
                startActivity(intentFinish)

            }else {
                startActivity(intentFinish)
            }
        }
    }
}
