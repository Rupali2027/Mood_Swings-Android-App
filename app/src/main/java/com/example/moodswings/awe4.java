package com.example.moodswings;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class awe4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.awe41);

        final Context context = this;
        Button button = (Button) findViewById(R.id.but1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://open.spotify.com/playlist/4AzctCwEqHCK39QJ8x2xWE?si=GEP57jkQRfeWynHw2rtpfQ"));
                startActivity(intent);
            }

        });
    }
}

