package org.example

fun whenExample(traficLight: String){
    when (traficLight) {
        "red" -> println("Stop")
        "yellow" -> println("slow down")
        "green" -> println("Go!")
        "black", "pink" -> println("Funny 🥒")
        else -> println("Not exists")
    }
}

fun primeNumberCheck(number: Any){
    when (number) {
        2, 3, 5, 7 -> println("$number is a prime number between 1 to 10")
        in 1..10 -> println("$number is a not a prime number but it between 1 to 10")
        is Int -> println("$number ia a Integer but not between 1 to 10")
        else -> println("Not a integer number and not lye between 1 to 10")
    }
}

fun main(){

    whenExample("black")

    primeNumberCheck(15.6)
}