package com.example.BiographyApp

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AlertDialog
import com.example.BiographyApp.adapter.GalleryCustomAdapter
import com.example.BiographyApp.databinding.ActivityGalleryBinding
import com.example.BiographyApp.services.GalleryService

class GalleryActivity : ForAllMenuActivity() {

    private lateinit var binding: ActivityGalleryBinding
    private val galleryServiceResult = GalleryService().galleryResult()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityGalleryBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val customAdapter = GalleryCustomAdapter(this, galleryServiceResult)
        binding.galleryListView.adapter = customAdapter

        binding.galleryListView.setOnItemClickListener { adapterView, view, i, l ->
            alertDialog(i)
        }

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        val item = menu?.findItem(R.id.galleryMenuItem)
        item?.isVisible = false
        return false
    }

    private fun alertDialog(index: Int) {
        val alert = AlertDialog.Builder(this)
        alert.setTitle("Are You Sure?")
        alert.setMessage("This action will take you to detail page.")
        alert.setCancelable(false)

        alert.setPositiveButton("Yes", DialogInterface.OnClickListener { dialogInterface, i ->
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("itemIndex", index)
            startActivity(intent)
        })
        alert.setNegativeButton("No", DialogInterface.OnClickListener { dialogInterface, i ->
        })
        alert.show()

    }

}