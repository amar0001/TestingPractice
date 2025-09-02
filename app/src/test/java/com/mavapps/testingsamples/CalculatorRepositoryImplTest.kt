package com.mavapps.testingsamples

import com.mavapps.testingsamples.data.repository.CalculatorRepositoryImpl

import org.junit.Assert.*
import org.junit.Test
class CalculatorRepositoryImplTest {

    private val repo = CalculatorRepositoryImpl()

    @Test
    fun testAddition() {
        assertEquals(5, repo.add(2, 3))
    }

    @Test
    fun testSubtraction() {
        assertEquals(3, repo.subtract(5, 2))
    }

    @Test
    fun testMultiplication() {
        assertEquals(12, repo.multiply(4, 3))
    }
}
