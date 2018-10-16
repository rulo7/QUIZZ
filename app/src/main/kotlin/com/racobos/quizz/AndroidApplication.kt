package com.racobos.quizz

import android.support.multidex.MultiDexApplication
import com.racobos.quizz.di.InjectorComponent
import com.racobos.quizz.di.injectorComponent

class AndroidApplication : MultiDexApplication(), InjectorComponent by injectorComponent() {

    override fun onCreate() {
        injector.inject(this)
        super.onCreate()
    }
}

