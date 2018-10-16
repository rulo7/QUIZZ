package com.racobos.quizz.di

import com.racobos.quizz.AndroidApplication
import com.racobos.quizz.main.MainActivity
import com.racobos.quizz.repository.AuthRepository
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [(ApplicationModule::class)])
interface ApplicationComponent {
    fun inject(androidApplication: AndroidApplication)
    fun inject(mainActivity: MainActivity)
    fun repository(): AuthRepository
}