package com.example.mabalancaapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    EditText harga;
    Button simpanharga;
    private DatabaseReference mDatabase;

    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDatabase = FirebaseDatabase.getInstance().getReference("HargaKamera").child("harga");

        simpanharga = findViewById(R.id.buttonSimpan);
        harga = findViewById(R.id.editTextAngka);

        simpanharga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mDatabase.setValue(harga.getText().toString());
            }
        });
    }
}