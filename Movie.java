public class Movie extends Video{
    private double rating;
    public Movie(String title, int duration, int rating) {
        super(title, duration);
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(int episodes) {
        this.rating = episodes;
    }

    @Override
    public String getMovieInfo() {
        return super.getMovieInfo() + " Rating " + rating;
    }
}
