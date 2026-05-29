package com.example.eksplisitintentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        Intent i = getIntent();
        String X = i.getStringExtra("nilai");

        Toast.makeText(this, "Nilai diterima : " + X, Toast.LENGTH_SHORT).show();
    }
}