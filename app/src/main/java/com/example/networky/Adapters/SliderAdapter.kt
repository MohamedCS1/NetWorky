package com.example.networky.Adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import com.example.networky.ThemeDetailsActivity
import com.smarteist.autoimageslider.SliderViewAdapter

class SliderAdapter(val arrayOfImages:Array<Int>): SliderViewAdapter<SliderAdapter.Holder>() {
    override fun getCount(): Int {
        return arrayOfImages.size
    }

    override fun onCreateViewHolder(parent: ViewGroup?): SliderAdapter.Holder {
        val view = LayoutInflater.from(parent!!.context).inflate(com.example.networky.R.layout.item_slider ,parent ,false)
        return Holder(view);
    }

    override fun onBindViewHolder(viewHolder: SliderAdapter.Holder?, position: Int) {
        viewHolder!!.imageview.setBackgroundResource(arrayOfImages[position])

    }

    class Holder(itemview: View): SliderViewAdapter.ViewHolder(itemview) {
        val imageview = itemview.findViewById<ImageView>(com.example.networky.R.id.image_view)
    }
}