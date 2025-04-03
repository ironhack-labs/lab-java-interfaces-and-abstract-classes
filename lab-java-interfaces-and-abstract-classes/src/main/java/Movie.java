public class Movie extends Video{

    private final double rating;

    public Movie(String title, int duration, int episodes, double rating) {
        super(title, duration);
        this.rating = episodes;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Ratings: " + rating;
    }
}
