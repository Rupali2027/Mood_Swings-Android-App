package com.example.moodswings;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class dep3 extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dep31);
        Log.d(TAG, "onCreate:Starting.");

        Button btnNavToSecond = (Button) findViewById(R.id.button);

        btnNavToSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick:Clicked btnNavToSecond.");
                Intent intent = new Intent(dep3.this, dep2.class);
                startActivity(intent);
            }
        });
        Button btnNavTofirst = (Button) findViewById(R.id.button6);

        btnNavTofirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick:Clicked btnNavToSecond.");
                Intent intent = new Intent(dep3.this, dep4.class);
                startActivity(intent);
            }
        });

        Button btnNavTothree = (Button) findViewById(R.id.button5);

        btnNavTothree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick:Clicked btnNavToSecond.");
                Intent intent = new Intent(dep3.this, photodep.class);
                startActivity(intent);
            }
        });

    }
}
