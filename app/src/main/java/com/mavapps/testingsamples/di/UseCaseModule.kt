package com.mavapps.testingsamples.di

import com.mavapps.testingsamples.domain.respository.CalculatorRepository
import com.mavapps.testingsamples.domain.usecase.AddUseCase
import com.mavapps.testingsamples.domain.usecase.MultiplyUseCase
import com.mavapps.testingsamples.domain.usecase.SubtractUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    @Provides
    @Singleton
    fun provideAddUseCase(repo: CalculatorRepository): AddUseCase  {
        return AddUseCase(repo)
    }
    @Provides
    @Singleton
    fun provideSubtractUseCase(repo: CalculatorRepository): SubtractUseCase {
        return SubtractUseCase(repo)
    }

    @Provides
    @Singleton
    fun provideMultiplyUseCase(repo: CalculatorRepository): MultiplyUseCase {
        return MultiplyUseCase(repo)
    }



}
