package com.example.hmw2

import android.app.Application
import com.example.hmw2.internet.LoveApi
import com.example.hmw2.internet.RetrofitService
class App: Application() {




        companion object{
            lateinit var api : LoveApi
        }

        override fun onCreate() {
            super.onCreate()
            val retrofitService = RetrofitService()
            api = retrofitService.api

    }
}