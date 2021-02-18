package com.example.myplayer

import android.util.Log


//abstract class Person(name: String, age: Int)

//Definición de clases en una sola línea
abstract class Person(name: String, val age: Int) {
    var name = name
        get() = "Name: $field" // palabra reservada para acceder al valor de la propiedad
        set(value)  {
            field = "Name: $value"
        }
}

class Developer : Person {

    //Varios constructores con la palabra reservada constructor
    constructor(name:String) : super(name, 20)

    constructor(age: Int) : super("john", age)
}

fun add(x: Int, y: Int): Int = x + y

fun test() {
    var x = "hola" // No es necesario definir un tipo
    var y: Any = 40 // Any = object de JAVA

    val z = 40
    var v: Long = z.toLong() //En kotlin no existen tipos primitivos, todos son objetos

    //En Java, es posible declarar múltiples variables del mismo tipo en una sola línea, pero esto no funcionará en Kotlin.
    // En Kotlin, todas las declaraciones de variable deben estar en sus propias líneas.

    //En Kotlin no existe la palabra new

    val d = Developer("John Remo")

}

interface Logger {
    //En Kotlin las interfaces pueden tener cuerpo
    val tag : String
        get() = javaClass.simpleName

    fun logD(message : String) {
        Log.d(tag, message)
    }

    fun logE(message: String) {
        Log.e(tag, message)
    }

}
