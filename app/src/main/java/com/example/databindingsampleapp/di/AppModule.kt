package com.example.databindingsampleapp.di

import android.content.Context
import com.example.databindingsampleapp.App
import dagger.Module
import dagger.Provides


@Module
object AppModule {
    @Provides
    @JvmStatic
    fun applicationContext(app: App): Context = app
}


