package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebActivity extends AppCompatActivity {

    WebView wvPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        wvPage = findViewById(R.id.wv_page);

        String URL = getIntent().getStringExtra("webPage");
        wvPage.setWebViewClient(new WebViewClient());
        wvPage.loadUrl("http://" + URL);
    }

    public void goBack(View view){
        finish();
    }
}