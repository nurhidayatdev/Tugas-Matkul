package com.example.timbangan;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ActivityResult extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        TextView txtStatus = findViewById(R.id.txtStatus);
        TextView txtDetail = findViewById(R.id.txtDetail);

        String nama = getIntent().getStringExtra("NAMA");
        String strTinggi = getIntent().getStringExtra("TINGGI");
        String strBerat = getIntent().getStringExtra("BERAT");

        double tinggi = Double.parseDouble(strTinggi != null ? strTinggi : "0");
        double beratActual = Double.parseDouble(strBerat != null ? strBerat : "0");

        double ideal = (tinggi - 100) - ((tinggi - 100) * 0.1);
        double selisih = Math.abs(beratActual - ideal);

        if (selisih <= 3) {
            txtStatus.setText("IDEAL");
            txtStatus.setTextColor(Color.parseColor("#4CAF50")); // Hijau
        } else {
            txtStatus.setText("TIDAK IDEAL");
            txtStatus.setTextColor(Color.parseColor("#E91E63")); // Merah
        }

        String infoDetail = "Halo " + nama + ",\n" +
                "Berdasarkan tinggi badan " + tinggi + " cm,\n" +
                "berat badan ideal Anda adalah " + String.format("%.1f", ideal) + " kg.\n" +
                "Berat Anda saat ini: " + beratActual + " kg.";
        txtDetail.setText(infoDetail);

        findViewById(R.id.btnKembali).setOnClickListener(v -> finish());
    }
}