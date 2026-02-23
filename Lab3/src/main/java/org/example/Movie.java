package org.example;

public class Movie extends Video{
    private double rating;

    //constructor
    public Movie(String title,int duration, double rating){
        super(title,duration);
        this.rating=rating;
    }

    //getters
    public double getRating(){
        return rating;
    }

    //setter
    public void setRating(double Rating){
        this.rating=Rating;
    }

    @Override
    public String getInfo(){
        return super.getInfo()
                +"\nRating:"+rating;
    }

}
