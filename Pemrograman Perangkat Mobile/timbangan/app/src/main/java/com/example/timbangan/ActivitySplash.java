package com.example.timbangan;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Handler;
import android.content.Intent;

public class ActivitySplash extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(() -> {
            startActivity(new Intent(this, MainActivity.class));
            finish();
        }, 3000); // 3 detik
    }
}