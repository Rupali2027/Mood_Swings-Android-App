package com.example.moodswings;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate:Starting.");

        Button btnNavTofirst = (Button) findViewById(R.id.button1);

        btnNavTofirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick:Clicked btnNavToSecond.");
                Intent intent = new Intent(MainActivity.this, awe3.class);
                startActivity(intent);
            }
        });


        Button btnNavToSecond = (Button) findViewById(R.id.button4);

        btnNavToSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick:Clicked btnNavToSecond.");
                Intent intent = new Intent(MainActivity.this, dep3.class);
                startActivity(intent);
            }
        });

        Button btnNavToThird = (Button) findViewById(R.id.button3);

        btnNavToThird.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick:Clicked btnNavToThird.");
                Intent intent = new Intent(MainActivity.this, hori3.class);
                startActivity(intent);
            }
        });
        Button btnNavToFourth = (Button) findViewById(R.id.button2);
        btnNavToFourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick:Clicked btnNavToFourth.");
                Intent intent = new Intent(MainActivity.this, soso3.class);
                startActivity(intent);
            }
        });







    }
}

