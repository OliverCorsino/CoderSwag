package com.olivercorsino.coderswag.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.olivercorsino.coderswag.R
import com.olivercorsino.coderswag.models.Product

class ProductsAdapter(private val context: Context, private val products: List<Product>): RecyclerView.Adapter<ProductsAdapter.ProductHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductHolder {
        val view = LayoutInflater.from(context)
            .inflate(R.layout.product_list_item, parent, false)

        return ProductHolder(view)
    }

    override fun getItemCount(): Int {
        return products.count()
    }

    override fun onBindViewHolder(holder: ProductHolder, position: Int) {
        holder.bindProduct(products[position], context)
    }

    inner class ProductHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val productName = itemView.findViewById<TextView>(R.id.productName)
        val productPrice = itemView.findViewById<TextView>(R.id.productPrice)
        val productImage = itemView.findViewById<ImageView>(R.id.productImage)

        fun bindProduct(product: Product, context: Context) {
            val resourceId = context.resources.getIdentifier(product.image, "drawable", context.packageName)

            productName?.text = product.name
            productPrice?.text = product.price
            productImage?.setImageResource(resourceId)

        }
    }
}