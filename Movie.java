public class Movie extends Video{
    double rating;
    public Movie(String title, int duration, double rating) {
        super(title, duration);
        this.rating = rating;

    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    @Override
    public String getInfo() {
        String stringGetinfo = super.toString();
        return  "Movie: " + stringGetinfo + " Rating: " + rating;
    }
}
