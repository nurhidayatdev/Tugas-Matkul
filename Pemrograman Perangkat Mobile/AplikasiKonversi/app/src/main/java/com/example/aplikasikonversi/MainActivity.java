package com.example.aplikasikonversi;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log; // Untuk output life cycle
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    Button button;
    TextView textViewHasil;
    RadioGroup radioGroupPilihan;
    RadioButton rbDollar, rbYen;

    private static final String TAG = "LifeCycleApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate dipanggil");

        editText = findViewById(R.id.editText1);
        button = findViewById(R.id.button1);
        textViewHasil = findViewById(R.id.hasilKonversi1);
        radioGroupPilihan = findViewById(R.id.radioGroupMataUang);
        rbDollar = findViewById(R.id.rbDollar);
        rbYen = findViewById(R.id.rbYen);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                konversiMataUang();
            }
        });
    }

    private void konversiMataUang() {
        String input = editText.getText().toString();

        if (input.isEmpty()) {
            Toast.makeText(this, "Masukkan nilai Rupiah!", Toast.LENGTH_SHORT).show();
            return;
        }

        double rupiah = Double.parseDouble(input);
        double hasil = 0;
        String simbol = "";

        int selectedId = radioGroupPilihan.getCheckedRadioButtonId();

        if (selectedId == rbDollar.getId()) {
            hasil = rupiah / 15000;
            simbol = "$ ";
        } else if (selectedId == rbYen.getId()) {
            hasil = rupiah / 100;
            simbol = "¥ ";
        } else {
            Toast.makeText(this, "Pilih mata uang tujuan!", Toast.LENGTH_SHORT).show();
            return;
        }

        textViewHasil.setText("Hasil: " + simbol + String.format("%.2f", hasil));
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart dipanggil");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume dipanggil");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause dipanggil");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop dipanggil");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy dipanggil");
    }
}