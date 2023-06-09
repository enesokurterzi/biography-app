package com.example.BiographyApp

import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.BiographyApp.databinding.ActivityDetailBinding
import com.example.BiographyApp.models.Gallery
import com.example.BiographyApp.services.GalleryService

class DetailActivity : ForAllMenuActivity() {

    private lateinit var binding: ActivityDetailBinding
    private val galleryServiceResult = GalleryService().galleryResult()
    private lateinit var galleryItem: Gallery

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        val itemIndex = intent.getIntExtra("itemIndex",0)
        galleryItem = galleryServiceResult[itemIndex]

        Glide.with(view).load(galleryItem.image).into(binding.imageDetail)
        binding.txtDetailPlace.text = galleryItem.place
        binding.txtDetailDetail.text =galleryItem.detail
    }
}