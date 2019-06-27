package com.olivercorsino.coderswag.controllers

import android.content.res.Configuration
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.widget.LinearLayout
import android.widget.Toast
import com.olivercorsino.coderswag.R
import com.olivercorsino.coderswag.adapters.ProductsAdapter
import com.olivercorsino.coderswag.services.DataService
import com.olivercorsino.coderswag.utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_products.*

class ProductsActivity : AppCompatActivity() {

    lateinit var adapter: ProductsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val selectedCategory = intent.getStringExtra(EXTRA_CATEGORY)

        adapter = ProductsAdapter(this, DataService.getProducts(selectedCategory))
        productListView.adapter = adapter
        
        var spanCount = 2
        val orientation = resources.configuration.orientation
        
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) {
            spanCount = 4
        }

        val layoutManager = GridLayoutManager(this, spanCount)
        productListView.layoutManager = layoutManager
        productListView.setHasFixedSize(true)
    }
}
