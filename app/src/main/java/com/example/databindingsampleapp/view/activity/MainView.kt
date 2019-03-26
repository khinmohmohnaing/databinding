package com.example.databindingsampleapp.view.activity

import com.example.databindingsampleapp.model.TemperatureData

interface MainView {
    fun showData(temperatureData: TemperatureData)
    fun add()
}