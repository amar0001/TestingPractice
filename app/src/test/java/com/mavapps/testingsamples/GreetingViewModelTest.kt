package com.mavapps.testingsamples



import org.junit.Assert.assertEquals
import org.junit.Before
import org.junit.Test

class GreetingViewModelTest {

    private lateinit var viewModel: GreetingViewModel

    @Before
    fun setup() {
        viewModel = GreetingViewModel()
    }

    @Test
    fun testMorningGreeting() {
        val result = viewModel.getGreeting(9)
        assertEquals("Good Morning", result)
    }

    @Test
    fun testAfternoonGreeting() {
        val result = viewModel.getGreeting(14)
        assertEquals("Good Afternoon", result)
    }

    @Test
    fun testEveningGreeting() {
        val result = viewModel.getGreeting(20)
        assertEquals("Good Evening", result)
    }
}
