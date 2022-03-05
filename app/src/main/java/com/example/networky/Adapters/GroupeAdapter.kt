package com.example.networky.Adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.networky.DuaChatActivity
import com.example.networky.R
import com.example.networky.ThemeDetailsActivity


class GroupeAdapter(val array_of_images:ArrayList<Int> ,val context: Context): RecyclerView.Adapter<GroupeAdapter.GroupeViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GroupeViewHolder {
        return GroupeViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.card_groupe ,null ,false))
    }


    override fun getItemCount(): Int {
        return array_of_images.size
    }

    class GroupeViewHolder(itemView: View): RecyclerView.ViewHolder(itemView)
    {
        val img = itemView.findViewById<ImageView>(R.id.groupe_imageview)
    }

    override fun onBindViewHolder(holder: GroupeViewHolder, position: Int) {
        holder.img.setBackgroundResource(array_of_images[position])
        holder.itemView.setOnClickListener {
            if (position == 4)
            {
                context.startActivity(Intent(context ,DuaChatActivity::class.java))
            }

        }
    }
}