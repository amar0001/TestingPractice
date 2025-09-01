package com.mavapps.testingsamples

import org.junit.After
import org.junit.AfterClass
import org.junit.Before
import org.junit.BeforeClass
import org.junit.Test

class LifecycleTest {


    companion object {
        @BeforeClass
        @JvmStatic
        fun beforeAll() {
            println("➡️ Runs once before all tests")
        }

        @AfterClass
        @JvmStatic
        fun afterAll() {
            println("➡️ Runs once after all tests")
        }
    }

    @Before
    fun beforeEach() {
        println("➡️ Runs before each test")
    }

    @After
    fun afterEach() {
        println("➡️ Runs after each test")
    }

    @Test
    fun test1() {
        println("✅ Test 1 running")
    }

    @Test
    fun test2() {
        println("✅ Test 2 running")
    }
}

