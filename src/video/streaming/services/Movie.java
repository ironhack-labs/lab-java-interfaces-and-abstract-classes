package video.streaming.services;

public class Movie extends Video {

    private double rating;

    public Movie(String title, int duration, double rating) {
        super(title, duration);
        setRating(rating);
    }

    @Override
    String getInfo() {
        return "Movie: " + "\n" +
                "title= " + getTitle() + "\n" +
                "duration= " + getDuration() + "\n" +
                "rating= " + getRating();
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

}
