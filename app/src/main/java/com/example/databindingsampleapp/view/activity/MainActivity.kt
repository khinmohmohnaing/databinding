package com.example.databindingsampleapp.view.activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import javax.inject.Inject
import android.databinding.DataBindingUtil
import com.example.databindingsampleapp.*
import com.example.databindingsampleapp.databinding.ActivityMainBinding
import com.example.databindingsampleapp.di.AppComponent
import com.example.databindingsampleapp.model.TemperatureData
import com.example.databindingsampleapp.view.activity.presenter.MainPresenter

class MainActivity : AppCompatActivity(), MainView {
    override fun showData(temperatureData: TemperatureData) {

    }

    override fun add() {
        Log.i("MainActivity","click")
    }

    @Inject
    lateinit var mainPresenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityMainBinding >(this,
            R.layout.activity_main
        )
        val temperatureData = TemperatureData("Hamburg", "10")
        binding.setTemp(temperatureData)
        binding.setAppPresenter(mainPresenter)
       // mainPresenter?.add()

        /*btn.setOnClickListener {
            mainPresenter.add()
        }*/
        //binding.setAppPresenter(mainPresenter)
        getApp()?.inject(this)

    }
    private fun getApp(): AppComponent? {
        return App.appComponent
    }
}
