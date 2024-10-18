package com.fleon.androiddesdecero


fun main() {
    //ifBasico()
    //ifAnidado()
    //ifBoolean()
    //ifInt()
//  ifMultipleAND()
    ifMultipleOR()
}

//fun ifBasico(){
//    //val name = "Aarón"
//    val name = "Fredymar"
//
//    if (name == "Fredymar") {
//        println("Perfecto, la variable name es Fredymar!")
//    } else {
//        println("Este no es Aarón")
//    }
//}

//    fun ifAnidado(){
//        val animal = "lion"
//
//        if (animal == "dog"){
//            println("¡Es un perro!")
//        } else if (animal == "cat"){
//            println("¡Es un gato!")
//        } else if (animal == "lion"){
//            println("¡Es un león!")
//        } else {
//            println("¡No es uno de los animales esperados!")
//        }
//    }

//fun ifBoolean(){
//    var iAmHappy: Boolean = false
//
//    if(!iAmHappy){
//        println("Estoy triste :(")
//    }
//}

//    fun ifInt(){
//        var age = 18
//
//        if (age >= 18){
//            println("¡Puedo ir a la discoteca!")
//        } else {
//            println("¡No puedo ir a la discoteca!")
//        }
//    }

//    fun ifMultipleAND(){
//        var age = 19
//        var parentPErmission = false
//        var iAmBusy = false
//
//        if (age >= 18 && parentPErmission && iAmBusy){
//            println(println("¡Puedo ir a la discoteca!"))
//        } else {
//            println("¡No puedo ir a la discoteca!")
//        }
//    }

    fun ifMultipleOR(){
        var pet = "dog"
        var isHappy = true

//        if(pet == "dog" || pet == "cat"){
//            println("El animal es un perro o un gato.")
//        }
        if (pet == "dog" && isHappy || (pet == "cat" && isHappy)){
            println("El animal es un $pet y está feliz.")
        } else {
            println("El animal no es un perro ni un gato.")
        }
    }