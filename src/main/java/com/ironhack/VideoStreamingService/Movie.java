package com.ironhack.VideoStreamingService;

public class Movie extends Video{

    private  double rating;

    public Movie(String title, int duration, double rating) {
        super(title, duration);
        setRating(rating);
    }
    public double getRating() {
        return rating;
    }
    public void setRating(double rating) {
        if(rating < 0 && rating > 10){
            System.err.println("Invalid rating");
        }
        this.rating = rating;
    }

    @Override
    public String getInfo() {
        return super.getInfo()+" rating: " + rating;
    }
}
