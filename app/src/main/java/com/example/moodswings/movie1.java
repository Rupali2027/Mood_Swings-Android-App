package com.example.moodswings;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;
import java.util.List;

public class movie1 extends AppCompatActivity {

    private List<slide1> lstslides;
    private ViewPager sliderpager;


    @Override
    protected  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.movie11);

        sliderpager=findViewById(R.id.move1);

        lstslides=new ArrayList<>();
        lstslides.add(new slide1(R.drawable.dora,"DORA"));
        lstslides.add(new slide1(R.drawable.s1,"Avengers"));
        lstslides.add(new slide1(R.drawable.download,"Moonlight"));
        lstslides.add(new slide1(R.drawable.s2,"Bloodshot"));
        lstslides.add(new slide1(R.drawable.s4,"The little Mermaid"));

        slidepageradapter adapter=new slidepageradapter(this,lstslides);
        sliderpager.setAdapter(adapter);

    }


}
