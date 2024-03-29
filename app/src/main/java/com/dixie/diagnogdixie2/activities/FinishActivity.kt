package com.dixie.diagnogdixie2.activities

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import com.dixie.diagnogdixie2.constants.AppConstants
import com.dixie.diagnogdixie2.R
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        //Setea la imagen con el personaje escogido al inicio, su audio y el nombre del mismo
        if(AppConstants.characterKid == AppConstants.cat){
            iv_characterSelected.setImageResource(R.drawable.neko)
            val mpNeko = MediaPlayer.create(this, R.raw.neko)
            mpNeko.start()
            tv_CharacterName.text = AppConstants.catName
        } else if(AppConstants.characterKid == AppConstants.dog){
            iv_characterSelected.setImageResource(R.drawable.dogui)
            val mpDogui = MediaPlayer.create(this, R.raw.dogui)
            mpDogui.start()
            tv_CharacterName.text = AppConstants.dogName
        } else if(AppConstants.characterKid == AppConstants.dinosaur){
            iv_characterSelected.setImageResource(R.drawable.rex)
            val mpRex = MediaPlayer.create(this, R.raw.rex)
            mpRex.start()
            tv_CharacterName.text = AppConstants.dinosaurName
        } else if(AppConstants.characterKid == AppConstants.chiken){
            iv_characterSelected.setImageResource(R.drawable.pio)
            val mpPio = MediaPlayer.create(this, R.raw.pio)
            mpPio.start()
            tv_CharacterName.text = AppConstants.chikenName
        } else if(AppConstants.characterKid == AppConstants.shark){
            iv_characterSelected.setImageResource(R.drawable.sharky)
            val mpSharky = MediaPlayer.create(this, R.raw.sharky)
            mpSharky.start()
            tv_CharacterName.text = AppConstants.sharkName
        } else if(AppConstants.characterKid == AppConstants.penguin){
            iv_characterSelected.setImageResource(R.drawable.pingui)
            val mpPingui = MediaPlayer.create(this, R.raw.pingui)
            mpPingui.start()
            tv_CharacterName.text = AppConstants.penguinName
        }

        //Accion del boton
        bt_NextResult.setOnClickListener {
            //Confirma que el editText no venga vacio
            if(TextUtils.isEmpty(ed_PaswwordUserConfirm.text)){
                Toast.makeText(this,"Ingrese el password para saber el resultado", Toast.LENGTH_LONG).show()
            }else{
                //Verifica que sea el passwod correcto
                if(ed_PaswwordUserConfirm.text.toString() != AppConstants.passwordUser){
                    Toast.makeText(this,"Ingrese el password correcto", Toast.LENGTH_LONG).show()
                }else{
                    //Pasa a la siguiente actividad
                    val intentResult = Intent(this@FinishActivity, ResultActivity::class.java)
                    startActivity(intentResult)
                }
            }
        }
    }
}
