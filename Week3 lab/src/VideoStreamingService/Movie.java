package VideoStreamingService;

public class Movie extends Video{
    double rating;

    public Movie(String title, int duration, double rating) {
        super(title, duration);
        this.rating = rating;
    }

    public String getInfo() {
        return "The title of this movie is \"" + title + "\". The duration is " + duration + " minutes, and it was rated as " + rating + "/10 stars.";
    }
}
