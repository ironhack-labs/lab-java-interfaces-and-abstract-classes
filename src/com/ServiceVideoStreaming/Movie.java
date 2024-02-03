package com.ServiceVideoStreaming;

public class Movie extends Video{
    private double rating;

    public Movie(String title, int duration){
        super(title, duration);
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }


    @Override
    public String getInfo() {
        return super.getInfo() + "\n" + "Rating : " + getRating();
    }
}
