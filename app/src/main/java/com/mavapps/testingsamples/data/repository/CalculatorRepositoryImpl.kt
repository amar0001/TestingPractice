package com.mavapps.testingsamples.data.repository

import com.mavapps.testingsamples.domain.respository.CalculatorRepository
import javax.inject.Inject

// data/repository/CalculatorRepositoryImpl.kt
class CalculatorRepositoryImpl @Inject constructor()  : CalculatorRepository {
    override fun add(a: Int, b: Int) = a + b
    override fun factorial(n: Int): Int =
        if (n <= 1) 1 else n * factorial(n - 1)

    override fun subtract(a: Int, b: Int) =  a-b

    override fun multiply(a: Int, b: Int): Int = a* b
}
