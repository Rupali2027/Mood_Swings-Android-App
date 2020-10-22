package com.example.moodswings;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class awe3 extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.awe31);
        Log.d(TAG, "onCreate:Starting.");

        Button btnNavToFourth = (Button) findViewById(R.id.button17);
        btnNavToFourth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick:Clicked btnNavToFourth.");
                Intent intent = new Intent(awe3.this, awe2.class);
                startActivity(intent);
            }
        });

        Button btnNavTofifth = (Button) findViewById(R.id.button16);
        btnNavTofifth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick:Clicked btnNavToFourth.");
                Intent intent = new Intent(awe3.this, awe4.class);
                startActivity(intent);
            }
        });


        Button btnNavToegt = (Button) findViewById(R.id.button18);
        btnNavToegt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick:Clicked btnNavToFourth.");
                Intent intent = new Intent(awe3.this, movie1.class);
                startActivity(intent);
            }
        });

    }
}
