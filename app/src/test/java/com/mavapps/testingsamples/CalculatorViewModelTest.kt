package com.mavapps.testingsamples

import com.mavapps.testingsamples.data.repository.CalculatorRepositoryImpl
import com.mavapps.testingsamples.domain.usecase.AddUseCase
import com.mavapps.testingsamples.domain.usecase.MultiplyUseCase
import com.mavapps.testingsamples.domain.usecase.SubtractUseCase
import com.mavapps.testingsamples.presentation.viewmodel.CalculatorViewModel

import org.junit.Assert.*
import org.junit.Test

class CalculatorViewModelTest {

    private val repo = CalculatorRepositoryImpl()
    private val vm = CalculatorViewModel(
        AddUseCase(repo),
        SubtractUseCase(repo),
        MultiplyUseCase(repo)
    )

    @Test
    fun testAdd() {
        vm.add(2, 3)
        assertEquals(5, vm.result.value)
    }
}
