package com.example.lab6z2v2

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.telephony.SmsMessage
import android.widget.Toast

class IncomingSms: BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        val toast = Toast.makeText(context, "Dostałeś SMS", Toast.LENGTH_LONG)
        toast.show()
    }
}