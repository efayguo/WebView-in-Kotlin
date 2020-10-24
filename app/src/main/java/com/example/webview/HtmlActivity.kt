package com.example.webview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_html.*

class HtmlActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_html)

        htmlView.settings.apply {
            javaScriptEnabled = true
            loadWithOverviewMode = true
//            useWideViewPort = true
            setSupportZoom(true)
        }
        htmlView.loadUrl("file:///android_asset/simple.html")

    }
}