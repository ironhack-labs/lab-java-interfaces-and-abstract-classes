package org.example;

public class Movie extends Video {
    double rating;

    public Movie(String tittle, int duration,double rating) {
        super(tittle, duration);
        this.rating = rating;
    }

    public String getinfo(){
        return getTittle()+" "+getDuration()+" "+rating;
    }


}
