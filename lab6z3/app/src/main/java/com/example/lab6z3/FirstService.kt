package com.example.lab6z3

import android.app.Service
import android.content.Intent
import android.os.Binder
import android.os.IBinder
import android.view.View
import android.widget.Toast
import java.util.*
import kotlin.concurrent.timerTask

class FirstService: Service() {
    private val binder = LocalBinder()
    private var number = 0;

    inner class LocalBinder : Binder() {
        fun getService(): FirstService = this@FirstService
    }

    override fun onBind(intent: Intent?): IBinder? {
        return binder
    }

    fun onButtonClick(view: View) {
        Toast.makeText(this, "Your bound service has been started", Toast.LENGTH_LONG).show()
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        val context = this
        Toast.makeText(context, "Your bound service has been started", Toast.LENGTH_LONG).show()
        while(true) {
            Timer().schedule(timerTask {
                Toast.makeText(context, "Your bound service is still working", Toast.LENGTH_LONG).show()

                number++
            }, 10000)
        }
    }
}