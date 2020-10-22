package com.example.moodswings;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;

public class photodep extends AppCompatActivity {

    ArrayList<Integer> mImageIds=new ArrayList<>(Arrays.asList(
            R.drawable.m1,R.drawable.m2,R.drawable.m3,R.drawable.m4,
            R.drawable.m5,R.drawable.m6,R.drawable.m7,R.drawable.m8,
            R.drawable.m11,R.drawable.m10,R.drawable.m9,R.drawable.m15


    ));

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.photodep1);
        GridView gridView=findViewById(R.id.mygrid);
        gridView.setAdapter(new ImageAdaptor(mImageIds,this));

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int item_pos = mImageIds.get(position);
                ShowDialogBox(item_pos);

            }
        });
    }


    public void ShowDialogBox(final int item_pos){
        final Dialog dialog=new Dialog(this);

        dialog.setContentView(R.layout.custom_dialog);

        TextView Image_name=dialog.findViewById(R.id.txt_image_name);
        ImageView Image=dialog.findViewById(R.id.img);
        Button btn_Full=dialog.findViewById(R.id.btn_full);
        Button btn_Close=dialog.findViewById(R.id.btn_close);

        String title=getResources().getResourceName(item_pos);

        int index=title.indexOf("/");
        String name=title.substring(index+1,title.length());
        Image_name.setText(name);

        Image.setImageResource(item_pos);

        btn_Close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });

        btn_Full.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(photodep.this,fullimage.class);
                i.putExtra("img_id",item_pos);
                startActivity(i);

            }
        });
        dialog.show();
    }
}
