package com.example.apktimbangan;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editNama, editUsia, editTinggi, editBerat;
    Button btnHitung;
    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editNama = findViewById(R.id.editNama);
        editUsia = findViewById(R.id.editUsia);
        editTinggi = findViewById(R.id.editTinggi);
        editBerat = findViewById(R.id.editBerat);
        btnHitung = findViewById(R.id.btnHitung);
        txtHasil = findViewById(R.id.txtHasil);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungBeratIdeal();
            }
        });
    }

    private void hitungBeratIdeal() {
        try {
            String nama = editNama.getText().toString();
            String usia = editUsia.getText().toString();
            double tinggi = Double.parseDouble(editTinggi.getText().toString());
            double beratSekarang = Double.parseDouble(editBerat.getText().toString());

            // Rumus: (Tinggi - 100) - ((Tinggi - 100) * 0.1)
            double beratIdeal = (tinggi - 100) - ((tinggi - 100) * 0.1);

            // Cek Klasifikasi (Selisih 3kg)
            double selisih = Math.abs(beratSekarang - beratIdeal);
            String klasifikasi = (selisih <= 3) ? "IDEAL" : "TIDAK IDEAL";

            // Tampilkan Hasil
            String hasil = "Nama: " + nama + "\n" +
                    "Usia: " + usia + " Tahun\n" +
                    "Tinggi: " + tinggi + " cm\n" +
                    "Berat Sekarang: " + beratSekarang + " kg\n" +
                    "Berat Ideal: " + beratIdeal + " kg\n" +
                    "Klasifikasi: " + klasifikasi;

            txtHasil.setText(hasil);

        } catch (Exception e) {
            Toast.makeText(this, "Harap isi semua data dengan benar", Toast.LENGTH_SHORT).show();
        }
    }
}