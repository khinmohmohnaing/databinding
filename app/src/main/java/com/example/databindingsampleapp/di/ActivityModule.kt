package com.example.databindingsampleapp.di

import com.example.databindingsampleapp.view.activity.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface ActivityModule {
    @ContributesAndroidInjector(modules = [MainModule::class])
    fun mainActivity(): MainActivity
}