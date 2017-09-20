package com.kamal.conditionals

import java.util.*

fun main(args: Array<String>) {
    var age: Int = 18
    val mode: Int = 3

    // If Conditions
    if (age < 18) {
        println("UnderAge")
    } else if (age < 22) {
        println("MiddleAge")
    } else {
        println("AboveAge")
    }


    //When Statement
    when (mode) {

        1 -> println("The mode is 1")
        2 -> println("The mode is 2")
        3 -> {
            println("The mode is 3")
            println("The mode is in super testing")
        }
        else -> println("The mode is unkonwn")
    }

    //Conditional As Expression
    // removed println()
    // last line wil be the result value here
    val result = when (mode) {

        1 -> "The mode is 1"
        2 -> "The mode is 2"
        3 -> {
            println("The mode is 3")
            "The mode is in super testing"
        }
        else -> "The mode is unkonwn"
    }

    // value x holds 24 if age is less than 20
    val x = if(age <20){
        println("The age is less than 20")
    } else{
        24
    }


    //More Advance "When" Constructs
    val num: Int = 78
    when(num){
        3 -> println("number is 3")
        2*5 -> println("the number is 10")
        "kamalraj".length -> "number is the length of the name kamalraj"
        in 1..10 -> println("num is between 1 and 10")
        in 11..20 -> println("num is between 11 and 20")
        !in 1..9 -> println("num is not between 1 and 9")
    }


    //Coding Challenge

    val rand = Random().nextInt(50)

    when(rand){
        in 1..10 -> println("$rand is in between 1 and 10 ")
        in 11..20 -> println("$rand is in between 11 and 20 ")
        in 21..30 -> println("$rand is in between 21 and 30 ")
        in 31..40 -> println("$rand is in between 31 and 40 ")
        in 41..50 -> println("$rand is in between 41 and 50 ")
        else -> println("The number is unknown")
    }



    println("The End!!")
}

