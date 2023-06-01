package com.example.BiographyApp.services

import com.example.BiographyApp.models.Contact

class ContactService {

    fun contactResult(): Contact {
        val contact = Contact(
            "+90 532 579 94 87",
            "enes.okurterzi@gmail.com",
            "https://github.com/enesokurterzi",
            "https://www.linkedin.com/in/enes-okurterzi/"
        )

        return contact
    }
}