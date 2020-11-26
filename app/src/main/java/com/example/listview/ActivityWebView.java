package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class ActivityWebView extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        //WebView adalah
        //suatu widget di android yang memungkinkan pengguna mengupload suatu halaman web di aplikasi

        webView = findViewById(R.id.web);
        webView = new WebView(this);
        webView.getSettings().setJavaScriptEnabled(true);

//        webView.loadUrl("https://www.dicoding.com/");
//        webView.loadUrl("file:///android_asset/manfaatbuah.html");
       webView.loadUrl("https://www.instagram.com/");
        setContentView(webView);
    }
}
