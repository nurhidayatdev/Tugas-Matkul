package com.example.switchton;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Switch saklar1, saklar2;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        saklar1 = (Switch) findViewById(R.id.saklar1);
        saklar2 = (Switch) findViewById(R.id.saklar2);
        submit = (Button) findViewById(R.id.submitButton);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String statusSaklar1, statusSaklar2;

                if (saklar1.isChecked())
                    statusSaklar1 = saklar1.getTextOn().toString();
                else
                    statusSaklar1 = saklar1.getTextOff().toString();

                if (saklar2.isChecked())
                    statusSaklar2 = saklar2.getTextOn().toString();
                else
                    statusSaklar2 = saklar2.getTextOff().toString();

                Toast.makeText(getApplicationContext(), "Lampu 1 :" +
                                statusSaklar1 + "\n" + "Lampu 2 :" + statusSaklar2,
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}