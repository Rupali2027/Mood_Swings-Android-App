package com.example.moodswings;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class vedioadapter1 extends RecyclerView.Adapter <vedioadapter1.VedioViewHolder>{

    List<Youtubevedio1> youtubeVedioList;

    public vedioadapter1() {
    }

    public vedioadapter1(List<Youtubevedio1> youtubeVedioList) {
        this.youtubeVedioList = youtubeVedioList;
    }



    @Override
    public VedioViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card1,parent,false);
        return new VedioViewHolder(view);


    }

    @Override
    public void onBindViewHolder(VedioViewHolder holder, int position) {

        holder.vedioWeb.loadData(youtubeVedioList.get(position).getVedioUrl(),"text/html","utf-8");

    }

    @Override
    public int getItemCount() {
        return youtubeVedioList.size();
    }

    public class VedioViewHolder extends RecyclerView.ViewHolder{

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
