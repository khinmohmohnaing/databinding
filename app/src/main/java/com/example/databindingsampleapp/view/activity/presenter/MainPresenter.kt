package com.example.databindingsampleapp.view.activity.presenter

import com.example.databindingsampleapp.model.TemperatureData

interface MainPresenter {
    fun showTempData(temperatureData: TemperatureData)
    fun add()
}