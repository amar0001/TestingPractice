package com.mavapps.testingsamples.domain.usecase

import com.mavapps.testingsamples.domain.respository.CalculatorRepository

class AddUseCase(private val repo: CalculatorRepository) {
    operator fun invoke(a: Int, b: Int) = repo.add(a, b)
}

class SubtractUseCase(private val repo: CalculatorRepository) {
    operator fun invoke(a: Int, b: Int) = repo.subtract(a, b)
}

class MultiplyUseCase(private val repo: CalculatorRepository) {
    operator fun invoke(a: Int, b: Int) = repo.multiply(a, b)
}
