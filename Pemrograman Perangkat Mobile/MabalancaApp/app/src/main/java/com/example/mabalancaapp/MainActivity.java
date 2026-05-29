package com.example.mabalancaapp;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private DatabaseReference mDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDatabase = FirebaseDatabase.getInstance().getReference("HargaKamera").child("harga");

        //DatabaseReference myRef = mDatabase.getReference("harga");

        //Menyimpan data pada Firebase
        //menyimpan data sederhana

        //update GoldPrice menjadi 2000 saat menlaunching applikasi
        mDatabase.setValue("9000");
    }
}
