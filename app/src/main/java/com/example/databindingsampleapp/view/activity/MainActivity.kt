package com.example.databindingsampleapp.view.activity

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import javax.inject.Inject
import android.databinding.DataBindingUtil
import android.widget.Button
import com.example.databindingsampleapp.App
import com.example.databindingsampleapp.*
import com.example.databindingsampleapp.databinding.ActivityMainBinding
import com.example.databindingsampleapp.di.AppComponent
import com.example.databindingsampleapp.model.TemperatureData
import com.example.databindingsampleapp.view.activity.presenter.MainPresenter
import kotlinx.android.synthetic.main.activity_main.*
import android.view.View
import android.widget.TextView
import dagger.android.AndroidInjector
import dagger.android.HasActivityInjector
import dagger.android.support.DaggerAppCompatActivity
import java.lang.Exception

class MainActivity : AppCompatActivity(), MainView  {


    override fun showData(temperatureData: TemperatureData) {
        Log.i("MainActivity","click click")
    }

    override fun add() {
        Log.i("MainActivity","click")
        Log.i("MainActivity",clickBtn.text.toString())
    }

    @Inject
    lateinit var mainPresenter: MainPresenter
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        getApp()?.inject(this)
        clickBtn.setOnClickListener {
            mainPresenter.add()
        }
        binding = DataBindingUtil.setContentView<ActivityMainBinding >(this,
            R.layout.activity_main
        )
        getApp()?.inject(this)
        val temperatureData = TemperatureData("Hamburg", "10")
        binding.setTemp(temperatureData)
        binding.setAppPresenter(mainPresenter)
    }
    private fun getApp(): AppComponent? {
        return App.appComponent
    }
}
