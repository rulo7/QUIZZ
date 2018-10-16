package com.racobos.quizz.di

import com.racobos.quizz.repository.AuthDataRepository
import com.racobos.quizz.repository.AuthRepository
import dagger.Module
import dagger.Provides
import io.reactivex.Scheduler
import javax.inject.Singleton

@Module
class ApplicationModule(private val androidScheduler: Scheduler) {
    @Provides
    @Singleton
    fun provideAuthRepository(repository: AuthDataRepository): AuthRepository = repository

    @Provides
    @Singleton
    fun androidScheduler() = androidScheduler
}