package com.dixie.diagnogdixie2.constants

import android.app.Application

//Clase que contiene las variables constantes de la aplicacion
class AppConstants {
    companion object{
        //Password del usuario
        var passwordUser: String = ""

        //ID del personaje escogido
        var characterKid: Int = 0

        //Puntaje del nino
        var score: Int = 0

        //Edad del nino
        var ageKid: Int = 0

        //Id personajes
        var cat:Int = 0
        var dog:Int = 0
        var dinosaur:Int = 0
        var chiken:Int = 0
        var shark:Int = 0
        var penguin: Int = 0

        //Nombre personajes
        var catName:String = "Neko"
        var dogName:String = "Dogui"
        var dinosaurName: String = "Rex"
        var chikenName: String = "Pio"
        var sharkName: String = "Sharky"
        var penguinName: String = "Pingui"
    }

}