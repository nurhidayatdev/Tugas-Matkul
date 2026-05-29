package com.example.aplikasiperkenalan;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // Deklarasi View
    EditText editNama, editUsia, editTinggi, editBerat;
    Button btnHitung;
    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inisialisasi View
        editNama = findViewById(R.id.editNama);
        editUsia = findViewById(R.id.editUsia);
        editTinggi = findViewById(R.id.editTinggi);
        editBerat = findViewById(R.id.editBerat);
        btnHitung = findViewById(R.id.btnHitung);
        txtHasil = findViewById(R.id.txtHasil);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                prosesHitung();
            }
        });
    }

    private void prosesHitung() {
        try {
            String nama = editNama.getText().toString();
            String usia = editUsia.getText().toString();
            double tinggi = Double.parseDouble(editTinggi.getText().toString());
            double beratBadan = Double.parseDouble(editBerat.getText().toString());

            // Rumus Tantangan
            double beratIdeal = (tinggi - 100) - ((tinggi - 100) * 0.1);

            // Logika Klasifikasi (Selisih <= 3kg dianggap ideal)
            double selisih = Math.abs(beratBadan - beratIdeal);
            String klasifikasi = (selisih <= 3) ? "IDEAL" : "TIDAK IDEAL";

            // Menampilkan Hasil ke TextView
            String hasilakhir = "Nama: " + nama + "\n" +
                    "Usia: " + usia + " Tahun\n" +
                    "Tinggi: " + tinggi + " cm\n" +
                    "Berat Sekarang: " + beratBadan + " kg\n" +
                    "Berat Ideal: " + beratIdeal + " kg\n" +
                    "Klasifikasi: " + klasifikasi;

            txtHasil.setText(hasilakhir);
            Toast.makeText(this, "Berhasil Menghitung!", Toast.LENGTH_SHORT).show();

        } catch (Exception e) {
            Toast.makeText(this, "Harap isi semua kolom dengan benar", Toast.LENGTH_SHORT).show();
        }
    }
}