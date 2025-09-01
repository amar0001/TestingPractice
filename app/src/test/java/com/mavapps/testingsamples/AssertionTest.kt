package com.mavapps.testingsamples

import org.junit.Assert.*
import org.junit.Test

class AssertionTest {

    @Test
    fun testAssertions() {
        val list = listOf("A", "B", "C")

        assertEquals(3, list.size)          // size is 3
        assertTrue(list.contains("B"))      // list has B
        assertFalse(list.contains("D"))     // list does not have D
        assertNotNull(list)                 // list is not null
        assertNull(null)                    // check null
    }

    @Test(expected = ArithmeticException::class)
    fun testException() {
        val x = 10 / 0   // should throw ArithmeticException
    }
}
