package com.improve10x.uicomponents;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Button;

public class TopWebSitesActivity extends AppCompatActivity {
    Button googleBtn;
    WebView webViewWv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_web_sites);
        handleInit();
        handleGoogleBtn();


    }

    private void handleGoogleBtn() {
        googleBtn.setOnClickListener(v ->{

        } );
    }

    private void handleInit() {
        googleBtn.findViewById(R.id.google_btn);
        webViewWv.findViewById(R.id.webview_wv);


    }
}