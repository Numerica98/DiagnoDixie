package com.example.prueba.constants

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
        var age: Int = 0

        //Id personajes
        var cat:Int = 0
        var dog:Int = 0
        var dinosaur:Int = 0
        var chiken:Int = 0
        var shark:Int = 0
        var penguin: Int = 0

        //Nombre personajes
        var catName:String = ""
        var dogName:String = ""
        var dinosaurName: String = ""
        var chikenName: String = ""
        var sharkName: String = ""
        var penguinName: String = ""
    }

}