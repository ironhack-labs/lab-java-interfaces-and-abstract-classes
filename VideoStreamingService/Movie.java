package VideoStreamingService;

public class Movie extends Video{
    double rating;

    public Movie(String title, int duration, double rating) {
        super(title, duration);
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Rating of the movie: " + rating + "/10";
    }
}
