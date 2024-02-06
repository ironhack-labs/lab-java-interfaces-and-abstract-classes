package VideoStreamingService;

public class Movie extends Video {

    public Movie(String title, int duration) {
        super(title, duration);
    }

    @Override
    String getInfo() {
        return String.format("Title: %s\nDuration: %d minutes\nRating: %.1f", title, duration, rating);
    }
    private double rating;
}