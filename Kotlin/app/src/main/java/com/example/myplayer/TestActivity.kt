package com.example.myplayer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class TestActivity : AppCompatActivity(), Logger {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)

        val recyclerView : RecyclerView = findViewById(R.id.recycler)
        recyclerView.adapter = MediaAdapter(getItems())

        logD("Esta es una prueba de que estoy mostrando gaticos")
    }
}