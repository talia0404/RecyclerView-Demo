package com.talia.recyclerviewtutorial

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // finding the RecyclerView in the layout
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)

        // Seting RecyclerView to use a LinearLayout
        recyclerView.layoutManager = LinearLayoutManager(this)

        // defining how many products I want and assigning details
        val productList = mutableListOf(
            Product(R.drawable.product1, "Novelty Cat Pens"),
            Product(R.drawable.product2, "Acedemic Blue Pens"),
            Product(R.drawable.product3, "Colour Pens"),
            Product(R.drawable.product4, "Luxury Pens"),
            Product(R.drawable.ic_launcher_foreground, "Product 5"),
            Product(R.drawable.ic_launcher_foreground, "Product 6"),
            Product(R.drawable.ic_launcher_foreground, "Product 7"),
            Product(R.drawable.ic_launcher_foreground, "Product 8"),
            Product(R.drawable.ic_launcher_foreground, "Product 9"),
            Product(R.drawable.ic_launcher_foreground, "Product 10"),
            Product(R.drawable.ic_launcher_foreground, "Product 11"),
            Product(R.drawable.ic_launcher_foreground, "Product 12"),
            Product(R.drawable.ic_launcher_foreground, "Product 13"),
            Product(R.drawable.ic_launcher_foreground, "Product 14"),
            Product(R.drawable.ic_launcher_foreground, "Product 15"),
            Product(R.drawable.ic_launcher_foreground, "Product 16")
        )

        // Creating the adapter and assign it to the RecyclerView
        val adapter = ProductAdapter(productList)
        recyclerView.adapter = adapter
    }
}
