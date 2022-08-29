package com.example.hmw2.internet

import android.media.MediaPlayer.create
import android.media.audiofx.AutomaticGainControl.create
import android.os.SharedMemory.create
import retrofit2.Retrofit

class RetrofitService {



        private val retrofit = Retrofit.Builder()
            .baseUrl("https://love-calculator.p.rapidapi.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        val api: LoveApi = retrofit.create(LoveApi::class.java)


}




