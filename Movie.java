public class Movie extends Video{
    double rating;
    public Movie(String title, int duration, double rating) {
        super(title, duration);
        this.rating = rating;
    }
    @Override
    public String getInfo() {
        return "Movie - Title: " + title + ", Duration: " + duration + " minutes, Rating: " + rating;
    }
    // Getter for rating
    public double getRating() {
        return rating;
    }
}
