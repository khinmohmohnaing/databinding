package com.example.databindingsampleapp.view.activity.presenterImpl

import com.example.databindingsampleapp.view.activity.MainView
import com.example.databindingsampleapp.model.TemperatureData
import com.example.databindingsampleapp.view.activity.presenter.MainPresenter
import javax.inject.Inject

class MainPresenterImpl @Inject constructor(
    val view: MainView
): MainPresenter {
    override fun add() {
        view.add()
    }

    override fun showTempData(temperatureData: TemperatureData) {
        view.showData(temperatureData)
    }
}