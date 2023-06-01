package com.example.BiograpyApp

import android.os.Bundle
import android.view.Menu
import android.webkit.WebViewClient
import com.example.BiograpyApp.databinding.ActivityBlogBinding

class BlogActivity : ForAllMenuActivity() {

    private lateinit var binding: ActivityBlogBinding
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBlogBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val url = "https://github.com/enesokurterzi"
        binding.blogWebView.settings.javaScriptEnabled = true
        binding.blogWebView.webViewClient = WebViewClient()
        binding.blogWebView.loadUrl(url)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        super.onCreateOptionsMenu(menu)
        val item = menu?.findItem(R.id.blogMenuItem)
        item?.isVisible = false
        return false
    }

}