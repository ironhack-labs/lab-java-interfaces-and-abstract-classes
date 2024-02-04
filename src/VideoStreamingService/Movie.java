package VideoStreamingService;

public class Movie extends Video {
    // Constructors
    Movie(String title, int duration, double rating) {
        super(title, duration);
        setRating(rating);
    }

    // Attributes
    private double rating;

    // Getters and Setters
    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    // Methods
    @Override
    public String getInfo() {
        return getTitle() + " (" + getDuration() + " minutes) - rating: " + getRating();
    }
}
