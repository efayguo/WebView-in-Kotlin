package com.example.webview

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // WebViewClient allows you to handle
        // onPageFinished and override Url loading.
        webView.webViewClient = WebViewClient()


        // this will load the url of the website
        webView.loadUrl("https://www.apple.com/")
//        webView.loadUrl("file:///android_asset/simple.html")

        // this will enable the javascript settings
        webView.settings.javaScriptEnabled = true

        // if you want to enable zoom feature
        webView.settings.setSupportZoom(true)


        webView1.webViewClient = WebViewClient()
        webView1.loadUrl("file:///android_asset/simple.html")
        webView1.settings.javaScriptEnabled = true
        webView1.settings.setSupportZoom(true)

        webView2.webViewClient = WebViewClient()
        webView2.loadUrl("https://www.amazon.com/")
        webView2.settings.javaScriptEnabled = true
        webView2.settings.setSupportZoom(true)
    }
}