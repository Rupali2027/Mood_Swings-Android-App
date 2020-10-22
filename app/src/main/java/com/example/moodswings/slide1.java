package com.example.moodswings;

public class slide1 {

    private int Image;
    private String Title;

    public slide1(int image,String title){
        Image=image;
        Title=title;
    }

    public int getImage(){
        return Image;
    }

    public String getTitle(){
        return Title;
    }

    public void setImage(int image) {
        Image = image;
    }

    public void setTitle(String title) {
        Title = title;
    }
}
