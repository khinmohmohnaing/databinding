package com.example.databindingsampleapp

import android.app.Application
import android.content.Context
import dagger.Module
import javax.inject.Singleton
import dagger.Provides


@Module
object AppModule {
    @Provides
    @JvmStatic
    fun applicationContext(app: App): Context = app
}


