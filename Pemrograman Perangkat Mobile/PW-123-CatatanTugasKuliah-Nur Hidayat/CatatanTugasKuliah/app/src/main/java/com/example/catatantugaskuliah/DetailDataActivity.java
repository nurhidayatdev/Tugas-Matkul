package com.example.catatantugaskuliah;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class DetailDataActivity extends AppCompatActivity {

    TextView tvHasil;
    Button btnBack;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_data);

        tvHasil = findViewById(R.id.tvHasilDetail);
        btnBack = findViewById(R.id.btnBack);

        Intent intent = getIntent();
        String tugasId = intent.getStringExtra("TUGAS_ID");

        if (tugasId != null) {
            databaseReference = FirebaseDatabase.getInstance().getReference("tugas_kuliah").child(tugasId);

            databaseReference.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(@NonNull DataSnapshot snapshot) {
                    TugasKuliah tugas = snapshot.getValue(TugasKuliah.class);
                    if (tugas != null) {
                        String hasil = "Judul Tugas: " + tugas.getJudulTugas() +
                                "\nMata Kuliah: " + tugas.getMataKuliah() +
                                "\nDeskripsi: " + tugas.getDeskripsi() +
                                "\nStatus: " + (tugas.isSelesai() ? "Selesai" : "Belum Selesai");

                        tvHasil.setText(hasil);
                    }
                }

                @Override
                public void onCancelled(@NonNull DatabaseError error) {
                    Toast.makeText(DetailDataActivity.this, "Gagal mengambil data dari Firebase", Toast.LENGTH_SHORT).show();
                }
            });
        } else {
            if (intent != null) {
                String judul = intent.getStringExtra("JUDUL");
                String matkul = intent.getStringExtra("MATKUL");
                String deskripsi = intent.getStringExtra("DESKRIPSI");
                String status = intent.getStringExtra("STATUS");

                String hasil = "Judul Tugas: " + judul +
                        "\nMata Kuliah: " + matkul +
                        "\nDeskripsi: " + deskripsi +
                        "\nStatus: " + status;

                tvHasil.setText(hasil);
            }
        }

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}