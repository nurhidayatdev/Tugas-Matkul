package com.example.catatantugaskuliah;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class FormInputActivity extends AppCompatActivity {

    private static final String TAG = "LifecycleForm";
    EditText etJudul, etMatkul, etDeskripsi;
    Switch swStatus;
    Button btnSimpan, btnReset;

    // Firebase
    DatabaseReference databaseTugas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_input);
        
        Log.d(TAG, "onCreate dipanggil");
        Toast.makeText(this, "Lifecycle: onCreate", Toast.LENGTH_SHORT).show();

        databaseTugas = FirebaseDatabase.getInstance().getReference("tugas_kuliah");

        etJudul = findViewById(R.id.etJudulTugas);
        etMatkul = findViewById(R.id.etMataKuliah);
        etDeskripsi = findViewById(R.id.etDeskripsi);
        swStatus = findViewById(R.id.swStatusSelesai);
        btnSimpan = findViewById(R.id.btnSimpan);
        btnReset = findViewById(R.id.btnReset);

        btnSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String judul = etJudul.getText().toString().trim();
                String matkul = etMatkul.getText().toString().trim();
                String deskripsi = etDeskripsi.getText().toString().trim();

                boolean status = swStatus.isChecked();

                if (judul.isEmpty() || matkul.isEmpty()) {
                    Toast.makeText(FormInputActivity.this, "Judul dan Mata Kuliah tidak boleh kosong!", Toast.LENGTH_SHORT).show();
                    return;
                }

                String id = databaseTugas.push().getKey();
                TugasKuliah tugasBaru = new TugasKuliah(judul, matkul, deskripsi, status);
                
                if (id != null) {
                    databaseTugas.child(id).setValue(tugasBaru);
                }

                Toast.makeText(FormInputActivity.this, tugasBaru.getRingkasan(), Toast.LENGTH_LONG).show();

                Intent intent = new Intent(FormInputActivity.this, DetailDataActivity.class);
                intent.putExtra("TUGAS_ID", id);

                intent.putExtra("JUDUL", judul);
                intent.putExtra("MATKUL", matkul);
                intent.putExtra("DESKRIPSI", deskripsi);
                intent.putExtra("STATUS", status ? "Selesai" : "Belum Selesai");
                
                startActivity(intent);
            }
        });

        if (btnReset != null) {
            btnReset.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    etJudul.setText("");
                    etMatkul.setText("");
                    etDeskripsi.setText("");
                    swStatus.setChecked(false);
                }
            });
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart dipanggil");
        Toast.makeText(this, "Lifecycle: onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume dipanggil");
        Toast.makeText(this, "Lifecycle: onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause dipanggil");
        Toast.makeText(this, "Lifecycle: onPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop dipanggil");
        Toast.makeText(this, "Lifecycle: onStop", Toast.LENGTH_SHORT).show();
    }
}
