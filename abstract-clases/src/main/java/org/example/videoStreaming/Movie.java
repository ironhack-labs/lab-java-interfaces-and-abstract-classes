package org.example.videoStreaming;

public class Movie extends Video {
    private double rating;

    public Movie (String title, int duration,double rating){
        super(title,duration);
        setRating(rating);
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getInfo(){
        return "Pelicula: "+getTitle()+" de "+getDuration()+" minutos de duración y con un rating de "+getRating();
    }
}