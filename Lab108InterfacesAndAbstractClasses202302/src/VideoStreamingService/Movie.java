package VideoStreamingService;

public class Movie extends Video{
    private double rating;

    public Movie(String title, int duration, double rating) {
        super(title, duration);
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "rating=" + rating +
                "} " + super.toString();
    }
}
