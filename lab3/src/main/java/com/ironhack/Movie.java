package com.ironhack;

public class Movie extends Video {
    private double rating;

    public Movie(String title, int duration, double rating){
        super(title, duration);
        this.rating = rating;
    }

    @Override
    public String getInfo(){
        return "Video title: " + this.title + " | Duration: " + this.duration + " | Rating: " + this.rating + "\n";
    }
}
