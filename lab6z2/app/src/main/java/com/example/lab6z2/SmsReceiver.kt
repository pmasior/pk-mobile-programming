package com.example.lab6z2

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class SmsReceiver: BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {
        if(intent?.extras != null) {
            val toast = Toast.makeText(context, "You got message", Toast.LENGTH_LONG)
            toast.show()

//        if (intent?.action.equals("android.provider.Telephony.SMS_RECEIVED")) {
//            val bundle = intent?.extras
        }
    }
}