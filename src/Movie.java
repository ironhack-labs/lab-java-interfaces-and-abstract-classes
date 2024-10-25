public class Movie extends Video {

    private Double rating;

    public Movie(int duration, String title, Double rating) {
        super(duration, title);
        this.rating = rating;
    }
}
