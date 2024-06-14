// Abstract base class for all videos
abstract class Video {
    private String title;
    private int duration;

    public Video(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    // Abstract method to get video information
    public abstract String getInfo();
}

// TvSeries class
class TvSeries extends Video {
    private int episodes;

    public TvSeries(String title, int duration, int episodes) {
        super(title, duration);
        this.episodes = episodes;
    }

    @Override
    public String getInfo() {
        return "TV Series - Title: " + title + ", Duration: " + duration + " minutes, Episodes: " + episodes;
    }
}

// Movie class
class Movie extends Video {
    private double rating;

    public Movie(String title, int duration, double rating) {
        super(title, duration);
        this.rating = rating;
    }

    @Override
    public String getInfo() {
        return "Movie - Title: " + title + ", Duration: " + duration + " minutes, Rating: " + rating;
    }
}

// Example usage:
public class VideoStreaming {
    public static void main(String[] args) {
        TvSeries tvSeries = new TvSeries("Breaking Bad", 45, 62);
        System.out.println(tvSeries.getInfo());

        Movie movie = new Movie("Inception", 148, 8.8);
        System.out.println(movie.getInfo());
    }
}
