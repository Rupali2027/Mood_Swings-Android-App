package com.example.moodswings;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class hori4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hori41);

        final Context context = this;
        Button button = (Button) findViewById(R.id.but3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/playlist/5Iq0zAauo3f82PNg2cZ10r?si=HRwjwWJHSmmCsGwINBR-tA"));
                startActivity(intent);
            }

        });
    }
}
