package com.fleon.androiddesdecero

fun main() {
    /*
        *Tipos de funciones: básicas, con parámetros de entrada, con parámetros de salida y la mezcla entre estas.
     */

    myName()
    myAge( )
    name("Fredymar")
    add(25, 30)

    val mySubtract = subtract(20, 10)
    println(mySubtract)
}

//Funciones básicas.
fun myName(){
//    println("Me llamo Fredymar.")
}

//fun myAge(){
////    println("Tengo 33 años.")
//}


//Funciones com parámetros de entrada

fun name(name: String){
    println("Me llamo $name.")
}
//
//fun myAge(currentAge: Int){     //Función que recibe un parámetro.
//    println("Tengo $currentAge años.")
//}

fun myAge(currentAge: Int = 39){     //Función que recibe un parámetro por defecto: ese parámetro es asumido se por algun error la duncion no recibe un parámetro.
    println("Tengo $currentAge años.")
}



fun add(firstNumber: Int, secondNumber: Int) {       //Función que recibe dos parámtros y los suma.
    println(firstNumber + secondNumber)
}

//fun subtract(firstNumber: Int, secondNumber: Int): Int = firstNumber - secondNumber       //Función con parámetros de entrada y de salida reducida
fun subtract(firstNumber: Int, secondNumber: Int) = firstNumber - secondNumber