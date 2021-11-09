package com.example.lab5z2

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText: EditText = findViewById(R.id.myTextEdit)
        val sharedPref = this.getPreferences(Context.MODE_PRIVATE)
        val myTextViewValue = sharedPref.getString("myTextViewValue", "")
        editText.setText(myTextViewValue)
    }

    fun saveText(view: View) {
        val editText = findViewById<EditText>(R.id.myTextEdit)
        val sharedPref = this.getPreferences(Context.MODE_PRIVATE)
        val editor = sharedPref.edit()
        editor.putString("myTextViewValue", editText.text.toString())
        editor.commit()
    }
}