package com.mavapps.testingsamples.di

import com.mavapps.testingsamples.data.repository.CalculatorRepositoryImpl
import com.mavapps.testingsamples.domain.respository.CalculatorRepository
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideCalculatorRepositoryImpl(): CalculatorRepository = CalculatorRepositoryImpl()

//    @Binds
//    @Singleton
//    abstract fun bindCalculatorRepository(
//        impl: CalculatorRepositoryImpl
//    ): CalculatorRepository

}
