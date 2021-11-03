package com.example.lab4z3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class FirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun goToSecondActivity(view: View) {
        intent = Intent(this, SecondActivity::class.java).apply {}
        startActivity(intent)
    }
}