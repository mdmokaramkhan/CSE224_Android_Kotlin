package com.example.cse224

fun multiple(number: Int) {
    for (i in 1..10) {
        println("$number * $i = ${number * i}")
    }
}

fun loop2() {
    val fruits = arrayOf("Kiwi", "Apple", "Orange", "Banana")

    for (fruit in fruits) {
        println("for fruit is: $fruit")
    }

    var num = 0

    do {
        println("do while fruit is: ${fruits[num]}")
        num++
    } while (num <= 3)

    num  = 0

    while (num <= fruits.size-1) {
        println("while fruit is: ${fruits[num]}")
        num++
    }

}

fun question05(array: Array<Int>) {
    var sumOfOdd = 0
    var sumOfEven = 0
    var countEven = 0
    var countOdd = 0
    for (i in 0..array.size-1) {
        if(i % 2 == 0) {
            sumOfEven += array[i]
            countEven++
        } else {
            sumOfOdd += array[i]
            countOdd++
        }
    }
    println("Odd Average: ${sumOfOdd/countOdd}")
    println("Even Average: ${sumOfEven/countEven}")
}

class Test(var brand : String, val model: String) {
    fun starting() {
        println("$brand $model car")
    }
}

open class Car () {
    open fun start() {
        println("Parent")
    }
}

class NewCar: Car() {
    override fun start() {
        println("Child")
    }
}

fun main() {

    val s = arrayOf(1,2,3,4,3,5,3,2,1,4)
    question05(s);

    val obj = Test("Ford", "2015");
    obj.starting();
    val car = NewCar();
    car.start();
    {
// Question 01
//    val arr = arrayOf(1,3,4,7,8,2)
//    arr.sort()
//    println(arr[arr.size-2])
//
//    // Question 02
//    val s = arrayOf(1,2,3,4,3,5,3,2,1,4)
//    val s1 = s.toSet()
//
//    println(s1.toList())
//
//    // Question 04
//    val frequency = hashMapOf<Int, Int>()
//    for (i in s) {
//        if (frequency.containsKey(i)){
//            frequency[i] = frequency.getValue(i) + 1
//        } else {
//           frequency.set(i, 1);
//        }
//    }
//    println(frequency)
//
//    // Question 03
//    val arr2 = arrayOf("he", "hell", "hello", "a", "abc", "ab")
//
//    var max = arr2[0].length
//    var word = ""
//
//    for(i in arr2) {
//        if(i.length > max) {
//            max = i.length
//            word = i
//        }
//    }
//    println(word)
    }
}