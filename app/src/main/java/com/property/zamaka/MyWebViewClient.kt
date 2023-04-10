package com.property.zamaka

import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient

class MyWebViewClient : WebViewClient() {
    override fun shouldOverrideUrlLoading(view: WebView?, request: WebResourceRequest?): Boolean {
        // Implement your custom logic here.
        // Return true to indicate that this event has been handled.
        // Return false to allow the WebView to handle the event.
        return super.shouldOverrideUrlLoading(view, request)
    }
}