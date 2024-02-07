package VideoStreamingService;

public class Movie extends Video {

    private double rating;

    public Movie(String title, int duration) {

        super(title, duration);
        setRating(rating);
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    String getInfo() {
        return String.format("Title: %s\nDuration: %d minutes\nRating: %.1f", getTitle(), getDuration(), getRating());
    }

}