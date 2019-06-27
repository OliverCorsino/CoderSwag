package com.olivercorsino.coderswag.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.olivercorsino.coderswag.R
import com.olivercorsino.coderswag.models.Category

class CategoryAdapter(val context: Context, val categories: List<Category>): BaseAdapter() {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val categoryView: View
        val categoryViewHolder: CategoryViewHolder

        if (convertView == null) {
            categoryView = LayoutInflater.from(context).inflate(R.layout.category_list_item, null)
            categoryViewHolder = CategoryViewHolder()

            categoryViewHolder.categoryImage = categoryView.findViewById(R.id.categoryImage)
            categoryViewHolder.categoryName = categoryView.findViewById(R.id.categoryName)

            categoryView.tag = categoryViewHolder
        } else {
            categoryViewHolder = convertView.tag as CategoryViewHolder
            categoryView = convertView
        }

        val category = categories[position]
        val resourceId = context.resources.getIdentifier(category.image, "drawable", context.packageName)

        categoryViewHolder.categoryName?.text = category.name
        categoryViewHolder.categoryImage?.setImageResource(resourceId)

        return categoryView
    }

    override fun getItem(position: Int): Any {
        return categories[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return categories.count()
    }

    private class CategoryViewHolder {
        var categoryImage: ImageView? = null
        var categoryName: TextView? = null
    }
}