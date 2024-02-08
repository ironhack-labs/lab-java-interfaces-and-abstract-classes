package videoStreamingService;

public class Movie extends Video {
    private double rating;
    public Movie(String title, int duration, double rating) {
        super(title, duration);
        this.rating= rating;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String getInfo() {
        return "Title: " + getTitle() + "\nDuration: " + getDuration() + " minutes\nType: Movie\nRating: " + rating;
    }
}
