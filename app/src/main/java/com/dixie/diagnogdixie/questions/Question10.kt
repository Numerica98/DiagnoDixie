package com.dixie.diagnogdixie.questions

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.dixie.diagnogdixie.R
import com.dixie.diagnogdixie.constants.AppConstants
import kotlinx.android.synthetic.main.activity_question10.*
import kotlinx.android.synthetic.main.activity_question9.*

class Question10 : AppCompatActivity() {
    //Contadores para controlar si se selecciona el item mas de una vez
    var touchTextView1: Int = 0
    var touchTextView2: Int = 0
    var touchTextView3: Int = 0
    var touchTextView4: Int = 0
    var touchTextView5: Int = 0
    var touchTextView6: Int = 0

    private lateinit var imageCharacter: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question10)

        //Id del imageview a poner la imagen
        imageCharacter = findViewById(R.id.character_10)

        //Setea la imagen del personaje escogido, un sonido y mensaje
        if(AppConstants.characterKid == AppConstants.cat){
            imageCharacter.setImageResource(R.drawable.neko)
            val mpNeko = MediaPlayer.create(this, R.raw.neko)
            mpNeko.start()
            Toast.makeText(this, getString(R.string.motivation2), Toast.LENGTH_LONG).show()
        } else if(AppConstants.characterKid == AppConstants.dog){
            imageCharacter.setImageResource(R.drawable.dogui)
            val mpDogui = MediaPlayer.create(this, R.raw.dogui)
            mpDogui.start()
            Toast.makeText(this, getString(R.string.motivation2), Toast.LENGTH_LONG).show()
        } else if(AppConstants.characterKid == AppConstants.dinosaur){
            imageCharacter.setImageResource(R.drawable.rex)
            val mpRex = MediaPlayer.create(this, R.raw.rex)
            mpRex.start()
            Toast.makeText(this, getString(R.string.motivation2), Toast.LENGTH_LONG).show()
        } else if(AppConstants.characterKid == AppConstants.chiken){
            imageCharacter.setImageResource(R.drawable.pio)
            val mpPio = MediaPlayer.create(this, R.raw.pio)
            mpPio.start()
            Toast.makeText(this, getString(R.string.motivation2), Toast.LENGTH_LONG).show()
        } else if(AppConstants.characterKid == AppConstants.shark){
            imageCharacter.setImageResource(R.drawable.sharky)
            val mpSharky = MediaPlayer.create(this, R.raw.sharky)
            mpSharky.start()
            Toast.makeText(this, getString(R.string.motivation2), Toast.LENGTH_LONG).show()
        } else if(AppConstants.characterKid == AppConstants.penguin){
            imageCharacter.setImageResource(R.drawable.pingui)
            val mpPingui = MediaPlayer.create(this, R.raw.pingui)
            mpPingui.start()
            Toast.makeText(this, getString(R.string.motivation2), Toast.LENGTH_LONG).show()
        }

        //Listener e implementacion de sonido
        val play = findViewById(R.id.btn_play_10) as ImageView
        play.setOnClickListener {
            val mp = MediaPlayer.create(this, R.raw.bra)
            mp.start()
        }

        //Variables de id
        val textView1 = findViewById<TextView>(R.id.tv_question10_pra_0_0)
        val textView2 = findViewById<TextView>(R.id.tv_question10_dar_0_1)
        val textView3 = findViewById<TextView>(R.id.tv_question10_tar_1_0)
        val textView4 = findViewById<TextView>(R.id.tv_question10_bra_1_1)
        val textView5 = findViewById<TextView>(R.id.tv_question10_bar_2_0)
        val textView6 = findViewById<TextView>(R.id.tv_question10_tra_2_1)

        //Variable para generar el intent mas adelante
        val intentQuestion11 = Intent(this@Question10, Question19::class.java)

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

        bt_Question10.setOnClickListener {
            //Verifica si NO se ha seleccionado un item
            if(touchTextView1 % 2 == 0 && touchTextView2 % 2 == 0 && touchTextView3 % 2 == 0
                    && touchTextView4 % 2 == 0 && touchTextView5 % 2 == 0 && touchTextView6 % 2 == 0){
                Toast.makeText(this,getString(R.string.text_validar_siguiente), Toast.LENGTH_LONG).show()
            }

            //Verifica que esten seleccionados los items correctos
            else if(touchTextView4 % 2 != 0) //Que solo uno de los tres este seleccionado
            {
                //Aumenta el puntaje del nino
                AppConstants.score = AppConstants.score +1

                //Realiza el intent para ir a la segunda pregunta
                startActivity(intentQuestion11)

            }else {
                startActivity(intentQuestion11)
            }
        }
    }
}
