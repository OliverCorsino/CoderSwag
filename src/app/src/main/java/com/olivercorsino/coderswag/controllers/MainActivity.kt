package com.olivercorsino.coderswag.controllers

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.olivercorsino.coderswag.R
import com.olivercorsino.coderswag.adapters.CategoryAdapter
import com.olivercorsino.coderswag.services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this, DataService.categories)

        categoryListView.adapter = adapter;0
    }
}
