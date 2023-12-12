package com.example.fashionapp;

public class row {
    private int image;
    private String title, desc;

    //Constructor;

    public row(int image, String title) {
        this.image = image;
        this.title = title;

    }

    public row(){}

    //Getters

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getDesc() {
        return desc;
    }
}
