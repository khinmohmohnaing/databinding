package com.example.databindingsampleapp

import android.app.Activity
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import dagger.android.support.DaggerApplication
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AppModule::class,
    ActivityModule::class,
    AndroidSupportInjectionModule::class,
    MainModule::class
])
interface AppComponent : AndroidInjector<DaggerApplication> {
    fun inject(activity: MainActivity)
    @Component.Builder
    interface Builder {
        fun build(): AppComponent

        @BindsInstance
        fun app(mainActivity: MainActivity): Builder
    }
}