package com.manish.weatherapp2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import okhttp3.Dispatcher

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        GlobalScope.launch {
            val result= withContext(Dispatchers.IO){
                client.api.getdata("New Delhi")
            }
            if(result.isSuccessful)
            {
                result.body()?.let {
                    Log.i("Success","$it")
                }
            }
        }
    }
}
