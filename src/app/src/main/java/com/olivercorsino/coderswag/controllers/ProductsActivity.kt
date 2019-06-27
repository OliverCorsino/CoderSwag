package com.olivercorsino.coderswag.controllers

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.olivercorsino.coderswag.R
import com.olivercorsino.coderswag.utilities.EXTRA_CATEGORY

class ProductsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val selectedCategory = intent.getStringExtra(EXTRA_CATEGORY)

        Toast.makeText(this, "You are at: $selectedCategory", Toast.LENGTH_SHORT).show()
    }
}
