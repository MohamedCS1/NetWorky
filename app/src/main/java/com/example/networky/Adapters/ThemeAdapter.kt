package com.example.networky.Adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.networky.R
import com.example.networky.ThemeDetailsActivity

class ThemeAdapter(val array_of_images:ArrayList<Int> ,val context: Context):RecyclerView.Adapter<ThemeAdapter.ThemeViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ThemeViewHolder {
        return ThemeViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.card_theme ,null ,false))
    }

    override fun onBindViewHolder(holder: ThemeViewHolder, position: Int) {
        holder.img.setBackgroundResource(array_of_images[position])
        holder.itemView.setOnClickListener {
            context.startActivity(Intent(context , ThemeDetailsActivity::class.java))

        }
    }

    override fun getItemCount(): Int {
        return array_of_images.size
    }

    class ThemeViewHolder(itemView:View):RecyclerView.ViewHolder(itemView)
    {
        val img = itemView.findViewById<ImageView>(R.id.theme_imageview)
    }
}