package com.example.catatantugaskuliah;

import android.content.Intent;
import android.net.Uri; // Wajib di-import untuk Intent Implisit
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMulai = findViewById(R.id.btnMulai);
        Button btnExternal = findViewById(R.id.btnExternal);
        Button btnMaps = findViewById(R.id.btnMaps);

        btnMulai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent Eksplisit: Activity 1 -> Activity 2
                Intent intent = new Intent(MainActivity.this, FormInputActivity.class);
                startActivity(intent);
            }
        });

        btnExternal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent Implisit: Buka Google
                String url = "https://www.google.com";
                Intent intentImplisit = new Intent(Intent.ACTION_VIEW);
                intentImplisit.setData(Uri.parse(url));
                startActivity(intentImplisit);
            }
        });

        btnMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Intent Implisit: Buka Maps
                Intent mapIntent = new Intent(Intent.ACTION_VIEW);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });
    }
}
