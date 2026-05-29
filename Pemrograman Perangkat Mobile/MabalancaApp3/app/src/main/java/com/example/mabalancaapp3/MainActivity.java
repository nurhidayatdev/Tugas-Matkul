package com.example.mabalancaapp3;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private DatabaseReference mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inisialisasi Firebase Database ke node "Pengguna"
        mDatabase = FirebaseDatabase.getInstance().getReference("Pengguna");

        // Menghubungkan variabel dengan ID yang ada di Layout XML
        Button tombolSimpan = findViewById(R.id.buttonSimpan);
        EditText username = findViewById(R.id.teksUsername);
        EditText password = findViewById(R.id.teksPassword);

        // Memberikan aksi klik pada tombol simpan
        tombolSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Membuat objek DataPengguna dari input user
                DataPengguna pengguna1 = new DataPengguna(
                        username.getText().toString(),
                        password.getText().toString()
                );

                // Mengirim/Menyimpan data ke Firebase
                mDatabase.setValue(pengguna1);
            }
        });
    }
}