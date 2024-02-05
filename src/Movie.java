public class Movie extends Video{
    double rating;

    public Movie(String name, int duration, double rating) {
        super(name, duration);
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
        return "{ Title: " + getTitle() + " , Duration: " + getDuration() + " , Rating: " + getRating() + "}";
    }
}
