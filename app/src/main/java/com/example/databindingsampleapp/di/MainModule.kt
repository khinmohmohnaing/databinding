package com.example.databindingsampleapp.di

import com.example.databindingsampleapp.view.activity.MainActivity
import com.example.databindingsampleapp.view.activity.presenter.MainPresenter
import com.example.databindingsampleapp.view.activity.presenterImpl.MainPresenterImpl
import com.example.databindingsampleapp.view.activity.MainView
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module(includes = [MainModule.Declarations::class])
object MainModule {
    @Provides
    @JvmStatic
    fun mainView(mainActivity: MainActivity): MainView = mainActivity
    @Module
    interface Declarations {
        @Binds
        fun mainPresenter(mainPresenterImpl: MainPresenterImpl): MainPresenter
    }
    }