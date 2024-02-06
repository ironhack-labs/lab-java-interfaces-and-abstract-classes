package videoStreaming;

public class Movie extends Video {
    private int rating;
    public Movie(String title, int duration) {
        super(title, duration);
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String getType() {
        return "TV Series";
    }
}
