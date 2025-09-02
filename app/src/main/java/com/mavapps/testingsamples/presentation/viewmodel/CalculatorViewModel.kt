package com.mavapps.testingsamples.presentation.viewmodel

import androidx.lifecycle.ViewModel
import com.mavapps.testingsamples.domain.respository.CalculatorRepository
import com.mavapps.testingsamples.domain.usecase.AddUseCase
import com.mavapps.testingsamples.domain.usecase.MultiplyUseCase
import com.mavapps.testingsamples.domain.usecase.SubtractUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class CalculatorViewModel @Inject constructor(
    private val addUseCase: AddUseCase,
    private val subtractUseCase: SubtractUseCase,
    private val multiplyUseCase: MultiplyUseCase
) : ViewModel() {

   // fun addNumbers(a: Int, b: Int) = repo.add(a, b)

    private val _result = MutableStateFlow(0)
    val result: StateFlow<Int> = _result

    fun add(a: Int, b: Int) {
        _result.value = addUseCase(a, b)
    }

    fun subtract(a: Int, b: Int) {
        _result.value = subtractUseCase(a, b)
    }

    fun multiply(a: Int, b: Int) {
        _result.value = multiplyUseCase(a, b)
    }

}
