package com.example.databindingsampleapp

import android.content.Context
import javax.inject.Inject

interface MainPresenter {
    fun showTempData(temperatureData: TemperatureData)
    fun add()
}