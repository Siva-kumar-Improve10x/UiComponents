package com.improve10x.uicomponents;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.Button;

public class TopWebSitesActivity extends AppCompatActivity {
    Button googleBtn;
    Button faceBookBtn;
    Button youTubeBtn;
    Button twitterBtn;
    Button instagramBtn;
    WebView webViewWv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_web_sites);
        handleInit();
        handleGoogleBtn();
        handleFacebookBtn();
        handleYoutubeBtn();
        handleTwitterBtn();
        handleInstagramBtn();



    }

    private void handleInstagramBtn() {
        instagramBtn.setOnClickListener(v -> {
            webViewWv.loadUrl("https://www.instagram.com/");
        });

    }

    private void handleTwitterBtn() {
        twitterBtn.setOnClickListener(v -> {
            webViewWv.loadUrl("https://twitter.com/login?lang=en");
        });

    }

    private void handleYoutubeBtn() {
        youTubeBtn.setOnClickListener(v -> {
            webViewWv.loadUrl("https://www.youtube.com/");
        });
    }

    private void handleFacebookBtn() {
        faceBookBtn.setOnClickListener(v -> {
            webViewWv.loadUrl("https://www.facebook.com/");
        });
    }

    private void handleGoogleBtn() {
        googleBtn.setOnClickListener(v ->{
            webViewWv.loadUrl("https://www.google.com/");

        } );
    }

    private void handleInit() {
        googleBtn = findViewById(R.id.google_btn);
        webViewWv = findViewById(R.id.webview_wv);
        faceBookBtn = findViewById(R.id.facebook_btn);
        youTubeBtn = findViewById(R.id.youtube_btn);
        twitterBtn = findViewById(R.id.twitter_btn);
        instagramBtn = findViewById(R.id.instagram_btn);


    }
}