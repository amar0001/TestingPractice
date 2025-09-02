package com.mavapps.testingsamples.data.fake

class Calculator {
    fun add(a: Int, b: Int): Int = a + b
    fun multiply(a: Int, b: Int): Int = a * b
    fun division(a: Int, b: Int): Int = a / b
    fun subtraction(a: Int, b: Int): Int = a - b
    fun isEven(a: Int): Boolean = a % 2 == 0
    fun isOdd(a: Int): Boolean = a % 2 != 0
    fun factorial(n: Int): Int {
        require(n >= 0) { "Factorial is not defined for negative numbers" }
        return if (n == 0 || n == 1) 1 else n * factorial(n - 1)
    }
}