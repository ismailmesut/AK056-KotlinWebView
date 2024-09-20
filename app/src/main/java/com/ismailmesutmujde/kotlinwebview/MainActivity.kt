package com.ismailmesutmujde.kotlinwebview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ismailmesutmujde.kotlinwebview.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var bindingMain : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingMain = ActivityMainBinding.inflate(layoutInflater)
        val view = bindingMain.root
        setContentView(view)

        bindingMain.webView.settings.javaScriptEnabled = true

        bindingMain.webView.loadUrl("https://gelecegiyazanlar.turkcell.com.tr")
    }
}