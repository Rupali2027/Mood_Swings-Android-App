package com.example.moodswings;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class vedioadapter3 extends RecyclerView.Adapter<vedioadapter3.VedioViewHolder> {


    List<Youtubevedio3> youtubeVedioList;

    public vedioadapter3() {
    }

    public vedioadapter3(List<Youtubevedio3> youtubeVedioList) {
        this.youtubeVedioList = youtubeVedioList;
    }


    @Override
    public VedioViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card3, parent, false);
        return new VedioViewHolder(view);


    }

    @Override
    public void onBindViewHolder(VedioViewHolder holder, int position) {

        holder.vedioWeb.loadData(youtubeVedioList.get(position).getVedioUrl(), "text/html", "utf-8");

    }

    @Override
    public int getItemCount() {
        return youtubeVedioList.size();
    }

    public class VedioViewHolder extends RecyclerView.ViewHolder {

        WebView vedioWeb;


        public VedioViewHolder(View itemView) {
            super(itemView);

            vedioWeb = (WebView) itemView.findViewById(R.id.webVedioView);
            vedioWeb.getSettings().setJavaScriptEnabled(true);
            vedioWeb.setWebChromeClient(new WebChromeClient() {


            });
        }
    }
}


