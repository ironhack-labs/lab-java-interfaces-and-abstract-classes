public class Movie extends Video {
    //Movie objects should have an additional rating property, a double representing the rating of the movie.
    private double ratingProperty;

    //constructor

    public Movie(String title, int duration, double ratingProperty) {
        super(title, duration);
        this.ratingProperty = ratingProperty;
    }

    @Override
    public String getInfo() {
        return "Title of the movie: " + title + ";" + "The movie lasts for " + duration + "minutes" + ";" + " Rating " + ratingProperty;
    }
}
