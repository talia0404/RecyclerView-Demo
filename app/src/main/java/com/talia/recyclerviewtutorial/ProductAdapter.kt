package com.talia.recyclerviewtutorial

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// RecyclerView Adapter
class ProductAdapter(private var productList: MutableList<Product>) :
    RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {

    // holds references to each item's UI elements
    class ProductViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val productImageView: ImageView = view.findViewById(R.id.productImageView) // Product image
        val productDescriptionTextView: TextView = view.findViewById(R.id.productDescriptionTextView) // Description
        val deleteButton: Button = view.findViewById(R.id.deleteButton) // Delete button
    }

    // Create and return a new ViewHolder when needed
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return ProductViewHolder(view)
    }

    // Binding data to the ViewHolder
    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val product = productList[position] // Get current product
        holder.productImageView.setImageResource(product.imageResId) // Set image
        holder.productDescriptionTextView.text = product.description // Set description

        // Set click listener on the delete button
        holder.deleteButton.setOnClickListener {
            productList.removeAt(position) // Remove item from the list
            notifyItemRemoved(position) // Notify RecyclerView about item removal
            notifyItemRangeChanged(position, productList.size) // Update remaining items
        }
    }

    // Return total number of items in the list
    override fun getItemCount(): Int = productList.size
}

