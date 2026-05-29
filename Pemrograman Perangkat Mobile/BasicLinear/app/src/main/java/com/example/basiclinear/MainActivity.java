package com.example.basiclinear;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    // Deklarasi variabel agar terhubung dengan XML
    TextView tvHeader;
    EditText etInput;
    Button btnSimpan, btnHapus, btnKembali;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        // Menghubungkan variabel dengan ID di XML

        etInput = findViewById(R.id.edit_text);
        btnSimpan = findViewById(R.id.button_simpan);
        btnHapus = findViewById(R.id.button_hapus);
        btnKembali = findViewById(R.id.button_kembali);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}