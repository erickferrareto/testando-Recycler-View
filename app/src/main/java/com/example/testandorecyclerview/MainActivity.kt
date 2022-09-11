package com.example.testandorecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listTest = mutableListOf<MainItem>()
        listTest.add(
            MainItem(
                image = R.drawable.ic_baseline_brightness_3_24,
                textTest = R.string.olá
            )
        )
        listTest.add(
            MainItem(
                image = R.drawable.ic_baseline_brightness_high_24,
                textTest = R.string.mundo
            )
        )

        recyclerView = findViewById(R.id.reciycler)
        val adapter = recyclerAdapter(listTest)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = LinearLayoutManager(this)


    }
    private inner class recyclerAdapter(private val listTest : List<MainItem>) : RecyclerView.Adapter<recyclerViewHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): recyclerViewHolder {
            val inflate = layoutInflater.inflate(R.layout.recycler, parent, false)
            return recyclerViewHolder(inflate)
        }

        override fun onBindViewHolder(holder: recyclerViewHolder, position: Int) {
            val itemCorrent = listTest[position]
            holder.bind(itemCorrent)
        }

        override fun getItemCount(): Int {
            return listTest.size
        }

    }
    private inner class recyclerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(View: MainItem){
            val textTest : TextView  = itemView.findViewById(R.id.texto)
            val imageTest : ImageView = itemView.findViewById(R.id.image)
            imageTest.setImageResource(View.image)
            textTest.setText(View.textTest)

        }
    }
}