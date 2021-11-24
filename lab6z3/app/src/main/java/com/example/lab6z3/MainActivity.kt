package com.example.lab6z3

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat

class MainActivity : AppCompatActivity() {
    private lateinit var serviceIntent: Intent
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val serviceIntent = Intent(this, FirstService::class.java);
//        startActivity(serviceIntent)
        startService(serviceIntent)

//        bindSer
//        ContextCompat.startForegroundService(applicationContext, serviceIntent)

//val fs = FirstService();
//        bindService(Intent(applicationContext), fs, Context.BIND_AUTO_CREATE)
    }

    fun onClick(view: View) {
        startService(serviceIntent)

    }
}