package com.olivercorsino.coderswag.controllers

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import com.olivercorsino.coderswag.R
import com.olivercorsino.coderswag.models.Category
import com.olivercorsino.coderswag.services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter: ArrayAdapter<Category>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = ArrayAdapter(this,
            android.R.layout.simple_expandable_list_item_1,
            DataService.categories)

        categoryListView.adapter = adapter;0
    }
}
