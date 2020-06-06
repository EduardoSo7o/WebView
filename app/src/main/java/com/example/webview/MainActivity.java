package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText etPage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etPage = findViewById(R.id.et_webPage);
    }

    public void go(View view) {
        Intent intent = new Intent(this, WebActivity.class);

        intent.putExtra("webPage", etPage.getText().toString());
        startActivity(intent);
    }
}