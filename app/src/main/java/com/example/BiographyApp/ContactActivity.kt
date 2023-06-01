package com.example.BiographyApp

import android.os.Bundle
import android.view.Menu
import com.example.BiographyApp.databinding.ActivityContactBinding
import com.example.BiographyApp.services.ContactService

class ContactActivity : ForAllMenuActivity() {

    private lateinit var binding: ActivityContactBinding
    private val contactServiceResult = ContactService().contactResult()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContactBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.number.text = contactServiceResult.number
        binding.emailLink.text = contactServiceResult.email
        binding.gitHubLink.text = contactServiceResult.gitHub
        binding.LinkedInLink.text = contactServiceResult.linkedIn

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        val item = menu?.findItem(R.id.contactMenuItem)
        item?.isVisible = false
        return false
    }

}