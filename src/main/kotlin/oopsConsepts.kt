package org.example

/*
* Object oriented programming (OOPS) concepts
*
* 1.Abstraction - Hiding Implementation
* 2.Encapsulation - Restriction direct access to data
* 3.Inheritance - Reuse properties and behaviours
* 4.Polymorphism - One Function multiple form
*
* */


class Example{
    private val secret = "Hidden Place"

    private fun showSecret(){
        println(secret)
    }
    fun accessSecret(){
        showSecret()
    }

}

open class ProtectedExample{
    protected val protectedData = "Protected data"

    protected fun showData(){
        println(protectedData)
    }

    fun accessData(){
        showData()
    }
}
class Child: ProtectedExample(){
    fun accessProtectedData(){
        showData()
    }
}
fun main(){
    val obj = Example()
    obj.accessSecret()

    val proObj = Child()
    proObj.accessProtectedData()

}
