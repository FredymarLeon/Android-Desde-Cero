@file:Suppress("DUPLICATE_LABEL_IN_WHEN")

package com.fleon.androiddesdecero

import androidx.lifecycle.viewmodel.viewModelFactory

fun main() {
    getMeses(4)
    getTrimestres(4)
    getSemestres(15)
    result(true)
    result1(2)
    result2(5)
    result3(6)
}

    fun getMeses(mes: Int){//Meses del año, utilizamos RANGO
        when(mes){
            1 -> println("Enero")
            2 -> println("Febrero")
            3 -> println("Marzo")
            4 -> {
                println("Abril")
                println("¡Mes de mi cumpleaños!")
            }
            5 -> println("Mayo")
            6 -> println("Junio")
            7 -> println("Julio")
            8 -> println("Agosto")
            9 -> println("Septiembre")
            10 -> println("Octubre")
            11 -> println("Noviembre")
            12 -> println("Diciembre")
            else -> println("Mes inválido") //!in 1..12 -> println("Mes inválido")
        }
    }

    fun getTrimestres(mes: Int){    //Trimestres del año
        when(mes){
            1, 2, 3 -> println("Primer trimestre")
            4, 5, 6 -> println("Segundo trimestre")
            7, 8, 9 -> println("Tercer trimestre")
            10, 11, 12 -> println("Cuarto trimestre")
            else -> println("Trimestre no válido. Ingrese un mes del 1 al 12.")
        }
    }

    fun getSemestres(mes: Int){     //Semestres del año
        when(mes){
            in 1..6 -> println("Primer semestre")
            in 7..12 -> println("Segundo semestre")
            else -> println("Mes no válido. Por favor, introduzca un mes válido.")
        }
    }

    fun result(value: Any){     //NO ES RECOMENDADO UTILIZAR Any. Aqui podemos recibir cualquier tipo de valor y a depender del tipo de valor recibido, creo una condición a ser ejecutada.
        when(value){
            is Int -> value + value
            is String -> println("$value ¡Es una String!")
            is Boolean -> if(value) println("Es verdadero: true.")
        }
    }

    fun result1(mes: Int): String {     //Retornando value, colocando return antes de when
        return when(mes){
            in 1..6 -> "Primer semestre"
            in 7..12 -> "Segundo semestre"
            else -> "Mes no válido. Por favor, introduzca un mes válido."
        }
    }

    fun result2(mes: Int): String {     //Almacenando en una variable.
        val result = when(mes){
            in 1..6 -> "Primer semestre"
            in 7..12 -> "Segundo semestre"
            else -> "Mes no válido. Por favor, introduzca un mes válido."
        }
        return result
    }

//Retornando value, 3era manera.
    fun result3(mes: Int) = when(mes){
            in 1..6 -> "Primer semestre"
            in 7..12 -> "Segundo semestre"
            else -> "Mes no válido. Por favor, introduzca un mes válido."
    }