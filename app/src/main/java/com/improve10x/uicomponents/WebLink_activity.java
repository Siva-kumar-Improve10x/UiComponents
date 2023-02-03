package com.improve10x.uicomponents;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class WebLink_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_link);
        WebView webViewWv = findViewById(R.id.webview_wv);
        webViewWv.loadUrl("https://improve10x.com/home/index.html");




    }
}
