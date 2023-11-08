package com.example.recyclerviewgmailapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val items = arrayListOf<ItemModel>()
        repeat(16) {
            val index = it + 1;
            items.add(
                ItemModel("Doulingo", "It's time for your daily English lesson. Take 5 minutes now to complete it.",
                    "8:00 AM")
            )
        }

            val adapter = ItemAdapter(items)

            val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
            recyclerView.layoutManager = LinearLayoutManager(this)
            recyclerView.adapter = adapter
    }
}