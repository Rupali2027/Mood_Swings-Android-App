package com.example.moodswings;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.Vector;

public class dep2 extends AppCompatActivity{





        //RECYCLER VIEW FIELD
        RecyclerView recyclerView;

        //VECTOR FOR VEDIO URLS
        Vector<Youtubevedio1> youtubeVideos =new Vector<>();

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.dep21);

            recyclerView = (RecyclerView) findViewById(R.id.recyclerview1);
            recyclerView.setHasFixedSize(true);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));

            //Load vedio List
            youtubeVideos.add(new Youtubevedio1("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/6wKoaxd-Ypc\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"));
            youtubeVideos.add(new Youtubevedio1("https://open.spotify.com/track/6Upu6yjkdi0DVI8E3IBZEU?si=6h2VdavmTWGqOD_OkLoVaQ"));
            youtubeVideos.add(new Youtubevedio1("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/M6pPBqfrAnI\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"));
            youtubeVideos.add(new Youtubevedio1("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/OKJImnk-gzQ\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"));
            youtubeVideos.add(new Youtubevedio1("<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/U1w3ErSo6CY\" frameborder=\"0\" allow=\"accelerometer; autoplay; encrypted-media; gyroscope; picture-in-picture\" allowfullscreen></iframe>"));

            vedioadapter1 vedioadapter1 = new vedioadapter1(youtubeVideos);

            recyclerView.setAdapter(vedioadapter1);

    }
}
