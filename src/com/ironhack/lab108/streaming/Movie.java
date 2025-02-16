package com.ironhack.lab108.streaming;

public class Movie extends Video{
    private double rating;

    public Movie(String title, int duration, double rating) {
        super(title, duration);
        setRating(rating);
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        if(rating >= 0.0 && rating <= 5.0) {
            this.rating = rating;
        } else {
            this.rating = 1;
        }
    }

    @Override
    public void getInfo() {
        System.out.println("------------- Movie Information -------------" +
                "\nTitle       : " + getTitle() +
                "\nDuration    : " + getDuration() + " min" +
                "\nRating      : " + getRating() + "/5.0");
    }
}
