package com.example.relativeapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    // Deklarasi variabel sesuai komponen di gambar
    TextView textView1;
    EditText name;
    Spinner dates, times;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Menghubungkan variabel dengan ID di XML
        textView1 = findViewById(R.id.textView1);
        name = findViewById(R.id.name);
        dates = findViewById(R.id.dates);
        times = findViewById(R.id.times);
        button1 = findViewById(R.id.button1);

        // Pengaturan Insets agar layout tidak tertutup status bar
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}