package com.example.BiograpyApp

import android.content.Intent
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity

open class ForAllMenuActivity : AppCompatActivity() {

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.for_all_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId) {
            R.id.homeMenuItem -> {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            }
            R.id.aboutMenuItem -> {
                val intent = Intent(this, AboutActivity::class.java)
                startActivity(intent)
            }
            R.id.galleryMenuItem -> {
                val intent = Intent(this, GalleryActivity::class.java)
                startActivity(intent)
            }
            R.id.contactMenuItem -> {
                val intent = Intent(this, ContactActivity::class.java)
                startActivity(intent)
            }
            R.id.blogMenuItem -> {
                val intent = Intent(this, BlogActivity::class.java)
                startActivity(intent)
            }
        }
        return super.onOptionsItemSelected(item)
    }
}