package com.example.timbangan;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    EditText editNama, editUsia, editTinggi, editBerat;
    Button btnHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNama = findViewById(R.id.editNama);
        editUsia = findViewById(R.id.editUsia);
        editTinggi = findViewById(R.id.editTinggi);
        editBerat = findViewById(R.id.editBerat);
        btnHitung = findViewById(R.id.btnHitung);

        btnHitung.setOnClickListener(v -> {
            Intent i = new Intent(this, ActivityResult.class);
            i.putExtra("NAMA", editNama.getText().toString());
            i.putExtra("USIA", editUsia.getText().toString());
            i.putExtra("TINGGI", editTinggi.getText().toString());
            i.putExtra("BERAT", editBerat.getText().toString());
            startActivity(i); // Intent Eksplisit [cite: 204]
        });
    }
}