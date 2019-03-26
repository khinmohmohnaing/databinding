package com.example.databindingsampleapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject
import com.example.databindingsampleapp.R
import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.view.View
import android.widget.Toast
import com.example.databindingsampleapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(),MainView{
    override fun showData(temperatureData: TemperatureData) {

    }

    override fun add() {
        Log.i("MainActivity","click")
    }

    @Inject
    lateinit var mainPresenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = DataBindingUtil.setContentView<ActivityMainBinding >(this,R.layout.activity_main)
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
