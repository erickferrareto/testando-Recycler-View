package com.example.testandorecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.reciycler)
        val adapter = recyclerAdapter()
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)


    }
    private inner class recyclerAdapter : RecyclerView.Adapter<recyclerViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): recyclerViewHolder {
            val inflate = layoutInflater.inflate(R.layout.recycler, parent, false)
            return recyclerViewHolder(inflate)
        }

        override fun onBindViewHolder(holder: recyclerViewHolder, position: Int) {

        }

        override fun getItemCount(): Int {
            return 15
        }

    }
    private inner class recyclerViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    }
}