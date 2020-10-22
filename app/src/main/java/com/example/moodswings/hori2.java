package com.example.moodswings;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Vector;

public class hori2 extends AppCompatActivity {

    //RECYCLER VIEW FIELD
    RecyclerView recyclerView;

    //VECTOR FOR VEDIO URLS
    Vector<Youtubevedio2> youtubeVideos =new Vector<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hori21);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerview2);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //Load vedio List
        youtubeVideos.add(new Youtubevedio2("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/6wKoaxd-Ypc\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"));
        youtubeVideos.add(new Youtubevedio2("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/AvuQVi4IinY\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"));
        youtubeVideos.add(new Youtubevedio2("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/M6pPBqfrAnI\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"));
        youtubeVideos.add(new Youtubevedio2("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/OKJImnk-gzQ\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"));
        youtubeVideos.add(new Youtubevedio2("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/U1w3ErSo6CY\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"));

        vedioadapter2 vedioadapter2 = new vedioadapter2(youtubeVideos);

        recyclerView.setAdapter(vedioadapter2);
    }
}
