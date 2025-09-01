package com.mavapps.testingsamples

import androidx.lifecycle.ViewModel

class GreetingViewModel : ViewModel() {
    fun getGreeting(hour: Int): String {
        return when (hour) {
            in 0..11 -> "Good Morning"
            in 12..16 -> "Good Afternoon"
            else -> "Good Evening"
        }
    }
}
