package com.example.messageshareapp

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewActivity:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)

        var recyclerView: RecyclerView
        recyclerView = findViewById(R.id.recyclerView)

        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager = layoutManager

        val adapter = HobbiesAdapter(this, Supplier.hobbies)

        recyclerView.adapter = adapter



    }
}
