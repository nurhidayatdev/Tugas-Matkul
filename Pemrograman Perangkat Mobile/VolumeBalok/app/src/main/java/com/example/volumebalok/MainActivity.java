package com.example.volumebalok;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editPanjang, editLebar, editTinggi;
    Button btnHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inisialisasi View
        editPanjang = findViewById(R.id.editPanjang);
        editLebar = findViewById(R.id.editLebar);
        editTinggi = findViewById(R.id.editTinggi);
        btnHitung = findViewById(R.id.btnHitung);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Mengambil input string dan mengubahnya ke angka (double)
                String panjangStr = editPanjang.getText().toString();
                String lebarStr = editLebar.getText().toString();
                String tinggiStr = editTinggi.getText().toString();

                // Validasi agar tidak error jika input kosong
                if (!panjangStr.isEmpty() && !lebarStr.isEmpty() && !tinggiStr.isEmpty()) {
                    double p = Double.parseDouble(panjangStr);
                    double l = Double.parseDouble(lebarStr);
                    double t = Double.parseDouble(tinggiStr);

                    // Rumus Volume Balok
                    double hasil = p * l * t;

                    // Tampilkan hasil di Toast
                    Toast.makeText(MainActivity.this,
                            "Hasil Volume: " + hasil, Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this,
                            "Mohon isi semua data!", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}