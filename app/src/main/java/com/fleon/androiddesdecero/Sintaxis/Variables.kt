package com.fleon.androiddesdecero.Sintaxis

fun main(){

    /**
     * Variables Numéricas: Reciben un número como valor.
     */

    //Int: soporta desde -2,147,483,647 a 2,147,486,647
    val age: Int = 33
    val age1 = 33 //costante o inmutable
    var age2 = 36 //variable o inmutable

    //Imprime todo en una misma linea
//    print(age2)
//    age2 = 32
//    print(age2)

    //Imprime todo con un salto de linea
//    println(age2)
//    age2 = 32
//    println(age2)

    //Long: Ocupa más espacio en la memoria. Soporta desde -9,223,372,036,854,775,807 a 9,223,372,036,854,775,807 | Debo especificar el tipo explicito.
    val examples: Long = 33

    //Fload: almacena números decimales y soporta hasta 6 decimales
    val floatExamplesKotlin: Float = 33.6f

    //Double: soporta hasta 14 decimales y ocupa más memoria que Float en el dispositivo.
    val doubleExemplo: Double = 403.2345678
    val floatExamplesKotlin2 = 33.6f


    /**
     * Vriables alfanuméricas: pueden guardar diversos tipos de valores.
     */
    //Char: soporta un caracter. Se coloca entre comillas simples
    val charExample1Minuscula: Char ='f'
    val charExample2Mayuscula: Char = 'F'
    val charExample3Caracter: Char = '&'
    val charExample4Numero: Char = '4'
    val charExample1Minuscula2 ='f'

    //String: recibe una secuencia de caracteres. Se coloca entre comillas dobles.
    val stringExample: String = "Fredymar León"
    val stringExample2 = "Fredymar León"

    /**
     *Boolean: recibe valores de verdadero o falso | true - false
     */

    val booleanExample1: Boolean = true
    val booleanExample2: Boolean = false
    val booleanExample3 = true
    val booleanExample4 = false

//    print(doubleExemplo)
//    print(booleanExample2)
//    print(doubleExemplo)
//    print(charExample3Caracter)
//    print(stringExample)


    //Operaciones Aritmeticas

    val number1: Int = 10
    val number2 = 33 //costante o inmutable
    var number3 = 36 //variable o inmutable


//    println("Suma:")
//    println(number1 + number2)
//
//    println("Resta:")
//    println(number2 - number3)
//
//    println("Multiplicación:")
//    println(number1 * number3)
//
//    println("División:")
//    println(number3 / number2)
//
//    println("Modulo o resto:")
//    println(number3 % number1)


    //sumar un numero entero (Int) con un numero Double (Double)

    var numberInt = 20
    var numberDouble = 5.23
    var numberFloat = 14.8f

//    println("Sumando numero Int con numero Double")
//    println(numberInt +  numberDouble)  //La suma es realizado, pero el resultado? Que tipo de valor recibe? DOUBLE
//
//    println("Sumando numero Int con numero Double, obteniendo resultado de tipo Int")
//    var suma1: Int = numberInt + numberDouble.toInt()   //Para obtener el resultado de la suma de tipo entero
//    println(suma1)
//
//    println("Sumando numero Int con numero Float")
//    println(numberInt + numberFloat)    //La suma es realizado, pero el resultado? Que tipo de valor recibe? FLOAT
//
//    println("Sumando numero Double con numero Float")   //La suma es realizado, pero el resultado? Que tipo de valor recibe? FLOAT
//    println(numberDouble + numberFloat)


    /**
     * CONCATENAR
     */

    val name1 = "Fredymar"
    val name2 = "Aarón"
    val ageName1 = "33"
    val ageName2 = "36"

    //CONCATENAR
        var stringConcatenada1: String = ("¡Hola, me llamo $name1, tengo $ageName1 años! ¿Y tú, como te llamas?")
        var stringConcatenada2: String = ("Es un placer $name1, yo me llamo $name2 y tengo $age2 años.")
    println(stringConcatenada1)
    println()
    println(stringConcatenada2)

    //println(ageName2.toInt() + ageName2)  //No se puede sumar un Int con una String.
//    println()
//    println(ageName2.toInt() + ageName1.toInt())    //Ambos se convirtieron en tipo Int y la suma de ambos valores es posible.


}