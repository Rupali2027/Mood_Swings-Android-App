package com.example.moodswings;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class soso3 extends AppCompatActivity {


    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.soso31);
        Log.d(TAG, "onCreate:Starting.");

        Button btnNavToSecond = (Button) findViewById(R.id.button12);

        btnNavToSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick:Clicked btnNavToSecond.");
                Intent intent = new Intent(soso3.this, soso2.class);
                startActivity(intent);
            }
        });

        Button btnNavTofirst = (Button) findViewById(R.id.button13);

        btnNavTofirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick:Clicked btnNavToSecond.");
                Intent intent = new Intent(soso3.this, soso4.class);
                startActivity(intent);
            }
        });

    }

}
