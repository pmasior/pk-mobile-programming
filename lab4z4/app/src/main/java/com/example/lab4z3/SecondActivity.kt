package com.example.lab4z3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val arrayListOfStudents = ArrayList<Student>()
        arrayListOfStudents.add(Student("Harry", "Potter"))
        arrayListOfStudents.add(Student("Jan", "Kowalski"))
        arrayListOfStudents.add(Student("Keanu", "Reeves"))

        val recyclerView: RecyclerView = findViewById(R.id.recycler_view);
        val recyclerViewAdapter = RecyclerViewAdapter(arrayListOfStudents)
        recyclerView.adapter = recyclerViewAdapter
        recyclerView.layoutManager = LinearLayoutManager(applicationContext)



    }
}