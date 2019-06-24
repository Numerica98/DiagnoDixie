package com.example.prueba

import android.app.Application

//Clase que contiene las variables constantes de la aplicacion
class AppConstants : Application() {
    //Password del usuario
    var passwordUser: String = ""

    //ID del personaje escogido
    var characterKid: Int = 0

    //Puntaje del menor
    var score: Int = 0
}