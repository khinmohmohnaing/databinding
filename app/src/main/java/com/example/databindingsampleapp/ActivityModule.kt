package com.example.databindingsampleapp

import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector

@Module
interface ActivityModule {
    @ContributesAndroidInjector(modules = [MainModule::class])
    fun mainActivity(): MainActivity
}