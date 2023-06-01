package com.example.BiograpyApp

import android.os.Bundle
import android.view.Menu
import com.example.BiograpyApp.databinding.ActivityAboutBinding
import com.example.BiograpyApp.services.AboutService

class AboutActivity : ForAllMenuActivity() {

    private lateinit var binding: ActivityAboutBinding
    private val aboutServiceResult = AboutService().aboutContentResult()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAboutBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.aboutContent.text = aboutServiceResult.aboutContent

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        val item = menu?.findItem(R.id.aboutMenuItem)
        item?.isVisible = false
        return false
    }

}