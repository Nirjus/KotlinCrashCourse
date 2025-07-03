package org.example

import kotlinx.coroutines.*

/*
*  What is Coroutines in Kotlin?
Ans. Coroutines in Kotlin are lightweight threads that allow you to write asynchronous,
non-blocking code in a more readable and structured way.
Unlike traditional threads, coroutines do not create new system threads; instead,
they run within a single thread and can be suspended and resumed efficiently.

* 2. What is Asynchronous Programming or Non Blocking Code

* 3. Threads→ Becomes : Threads a Process are when
     Process → Contains multiple Threads
     Thread → Executes tasks in parallel
  Coroutine Works on top of Threads (lightweight & efficient)
* */

suspend fun fetchUser(): String{
    delay(2000)
    return "Fetch user"
}

suspend fun fetchOrders(orderData: String) :String{
    delay(2000)
    return "$orderData -> Order details fetched"
}

suspend fun fetchOrderDetails(orderData: String) : String{
    delay(3000)
    return "$orderData -> Order details fetched"
}

suspend fun fetchData() : String{
    delay(2000)  // Network delay
    return "Wassm man!"
}

fun main() = runBlocking { // main function run on the main thread
    val user = fetchUser()
    println(user)

    val orderData = fetchOrders(user)
    println(orderData)

    val orderDetails = fetchOrderDetails(orderData)
    println(orderDetails)

    GlobalScope.launch {
        val result = fetchData()
        println("User data $result on ${Thread.currentThread().name}")
    }
    println("This is a UI core, ${Thread.currentThread().name}")

    Thread.sleep(3000)

}

//fun main() = runBlocking {
//    launch {
//        delay(2000)
//        println("World!")
//    }
//    println("Hello")
//}