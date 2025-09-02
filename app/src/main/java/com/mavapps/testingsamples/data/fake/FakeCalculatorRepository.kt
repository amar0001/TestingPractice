package com.mavapps.testingsamples.data.fake

import com.mavapps.testingsamples.domain.respository.CalculatorRepository

// data/fake/FakeCalculatorRepository.kt
class FakeCalculatorRepository : CalculatorRepository {
    override fun add(a: Int, b: Int) = 42 // always fixed result for testing
    override fun factorial(n: Int) = 120 // e.g., always returns 5! for demo
    override fun subtract(a: Int, b: Int): Int=  4
    override fun multiply(a: Int, b: Int) =  28
}
