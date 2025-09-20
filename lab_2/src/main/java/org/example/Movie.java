package org.example;

public class Movie extends Video {
    double rating;

    public Movie(String title, int duration, double rating) {
        super(title, duration);
        setRating(rating);
    }

//    Getter
    public double getRating() {
        return rating;
    }

//    Setter
    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String getInfo() {
        String video = super.getInfo();
        rating = getRating();
        return video + "\nRating: " + rating;
    }
}
