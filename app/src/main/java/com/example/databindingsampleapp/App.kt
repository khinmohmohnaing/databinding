package com.example.databindingsampleapp


import android.app.Application
import com.example.databindingsampleapp.di.AppComponent
import com.example.databindingsampleapp.di.DaggerAppComponent
import com.example.databindingsampleapp.view.activity.MainActivity


class App: Application(){
    override fun onCreate() {
        super.onCreate()
        appComponent= DaggerAppComponent.builder()
            .app(MainActivity())
            .build()
    }
    companion object {
        var appComponent: AppComponent?=null
    }
}
