package com.racobos.quizz.main

import android.os.Bundle
import android.os.PersistableBundle
import android.support.v7.app.AppCompatActivity
import com.racobos.quizz.di.InjectorComponent
import com.racobos.quizz.di.injectorComponent
import org.jetbrains.anko.setContentView

class MainActivity : AppCompatActivity(), InjectorComponent by injectorComponent() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        injector.inject(this)
        super.onCreate(savedInstanceState, persistentState)
        MainActivityUI().setContentView(this)
    }

}