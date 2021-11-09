package com.example.lab5z3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    private var firstFragment: Fragment? = null
    private var secondFragment: Fragment? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        firstFragment = FirstFragment()
        secondFragment = SecondFragment()
    }

    fun changeFragmentToFirstFragment(view: View) {
        changeFragment(FirstFragment())
    }

    fun changeFragmentToSecondFragment(view: View) {
        changeFragment(SecondFragment())
    }

    private fun changeFragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager.beginTransaction()
        fragmentManager.replace(R.id.fragmentContainerView3, fragment)
        fragmentManager.commit()
    }
}