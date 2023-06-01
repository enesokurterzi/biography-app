package com.example.BiographyApp.adapter

import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.BiographyApp.R
import com.example.BiographyApp.models.Gallery

class GalleryCustomAdapter(private val context: Activity, private val list: List<Gallery>) : ArrayAdapter<Gallery>(context, R.layout.custom_list_item, list) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val rootView = context.layoutInflater.inflate(R.layout.custom_list_item, null, true)

        val r_image = rootView.findViewById<ImageView>(R.id.r_image)
        val r_place = rootView.findViewById<TextView>(R.id.r_place)
        val r_date = rootView.findViewById<TextView>(R.id.r_date)

        val gallery = list[position]

        Glide.with(rootView).load(gallery.image).into(r_image)

        r_place.text = gallery.place
        r_date.text = gallery.date

        return rootView
    }

}