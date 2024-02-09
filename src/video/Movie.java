package src.video;

public class Movie extends Video {
    private double rating;
    public Movie(String title, int duration, double rating) {
        super(title, duration);
        setRating(rating);
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getInfo() {
        return String.format("%s, Rating: %.1f stars", super.getInfo(), this.rating);
    }
}
