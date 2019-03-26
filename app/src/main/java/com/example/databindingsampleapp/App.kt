package com.example.databindingsampleapp


import android.app.Application
import dagger.android.DaggerApplication
import dagger.android.HasActivityInjector
import io.reactivex.plugins.RxJavaPlugins
import io.realm.Realm


class App: Application(){
    override fun onCreate() {
        super.onCreate()
        appComponent=DaggerAppComponent.builder()
            .app(MainActivity())
            .build()
    }
    companion object {
        var appComponent:AppComponent?=null
    }
}
