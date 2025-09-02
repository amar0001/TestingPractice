package com.mavapps.testingsamples

import com.mavapps.testingsamples.data.fake.Calculator
import org.junit.Test
import org.junit.Assert.*
import org.junit.Before

class CalculatorTest {
    private lateinit var calculator: Calculator

    @Before
    fun setup() {
        calculator = Calculator()
    }

    @Test
    fun testAddition() {
        val result = calculator.add(2, 3)
        assertEquals(5, result)
    }

    @Test
    fun testMultiplication() {
        val result = calculator.multiply(4, 5)
        assertEquals(20, result)
    }

    @Test
    fun testDivision() {
        val result = calculator.division(5, 0)
        assertEquals(1, result)
    }

    @Test
    fun testSubtraction() {
        val result = calculator.subtraction(4, 5)
        assertEquals(-1, result)
    }

    @Test(expected = ArithmeticException::class)
    fun testDivisionByZero() {
        val result = calculator.division(4, 0)
        assertEquals(0, result)
    }

    @Test
    fun testFactorial() {
        val result = calculator.factorial(5)
        assertEquals(120, result)

    }


}