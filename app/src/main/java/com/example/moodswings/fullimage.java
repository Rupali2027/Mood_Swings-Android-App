package com.example.moodswings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class fullimage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fullimage);

        ImageView imageView=findViewById(R.id.img_full);
        int img_id=getIntent().getExtras().getInt("img_id");
        imageView.setImageResource(img_id);


    }
}
