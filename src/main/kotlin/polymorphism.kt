package org.example


/*
* Polymorphism 😮
*
*          Two type
*              /\
*  Compile time  Run time
* */

// Compile time polymorphism 👇
class Calculator{
    fun add(a: Int, b: Int): Int{
        return a+b
    }
    fun add(a: Double, b: Double): Double{
        return a+b
    }
    fun add(a: Int, b: Int, c: Int): Int {
        return a+b+c
    }

}

open class LivingBing{
    open fun makeSound(){
        println("Make sound")
    }
}
class Bird: LivingBing(){
    override fun makeSound() {
        println("Chirp chirp 🦢🦢")
    }
}
class Whale: LivingBing(){
    override fun makeSound() {
        println("Flee Flee 🐳🐋")
    }
}

fun main(){
    val calcu = Calculator()
    var result: Any = calcu.add(5,4)
    println(result)
    result = calcu.add(5, 4, 3)
    println(result)
    result = calcu.add(50.3, 56.1)
    println(result)

    val bird = Bird()
    bird.makeSound()

    val whale = Whale()
    whale.makeSound()

}