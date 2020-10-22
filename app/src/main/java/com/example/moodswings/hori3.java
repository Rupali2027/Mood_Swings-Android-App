package com.example.moodswings;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class hori3 extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hori31);
        Log.d(TAG, "onCreate:Starting.");

        Button btnNavToThird = (Button) findViewById(R.id.button9);

        btnNavToThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick:Clicked btnNavToThird.");
                Intent intent = new Intent(hori3.this, hori2.class);
                startActivity(intent);
            }
        });

        Button btnNavTosec = (Button) findViewById(R.id.button11);

        btnNavTosec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick:Clicked btnNavToThird.");
                Intent intent = new Intent(hori3.this, hori4.class);
                startActivity(intent);
            }
        });
    }
}
