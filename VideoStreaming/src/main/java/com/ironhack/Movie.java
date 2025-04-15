package com.ironhack;

public class Movie extends Video{

    //Movie objects should have an additional rating property,
    // a double representing the rating of the movie.

    private double rating;

    public Movie(String title, int duration, double rating) {
        super(title, duration);
        this.rating = rating;
    }
    public double getRating() {
        return rating;
    }
    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Movie{"+"title="+getTitle()+"," +
                " duration="+getDuration()+", " +
                "rating="+rating+"}";
    }
}
