package com.example.databindingsampleapp

import android.util.Log
import javax.inject.Inject

class MainPresenterImpl @Inject constructor(
    val view: MainView):MainPresenter {
    override fun add() {
        view.add()
    }

    override fun showTempData(temperatureData: TemperatureData) {
        view.showData(temperatureData)
    }
}