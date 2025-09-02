package com.mavapps.testingsamples.domain.respository


// domain/repository/CalculatorRepository.kt
interface CalculatorRepository {
    fun add(a: Int, b: Int): Int
    fun factorial(n: Int): Int
    fun subtract(a: Int, b: Int): Int
    fun multiply(a: Int, b: Int): Int
}
