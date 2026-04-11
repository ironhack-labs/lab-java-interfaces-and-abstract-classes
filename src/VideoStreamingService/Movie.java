package VideoStreamingService;

public class Movie extends Video {
    private double rating;


    public Movie(String title, int duration, double rating) {
        super(title, duration);
        this.rating = rating;
    }

    @Override
    public void getInfo() {
        System.out.println(getTitle() +  " has a rating of " + rating + " over 10");
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }
}
