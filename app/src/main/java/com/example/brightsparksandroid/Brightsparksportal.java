package com.example.brightsparksandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class Brightsparksportal extends AppCompatActivity {
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_brightsparksportal);

        webView = (WebView) findViewById(R.id.brighsparkslogin);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://brightsparks.com.sg/login.php");

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }

    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
        super.onBackPressed();
    }
}}
