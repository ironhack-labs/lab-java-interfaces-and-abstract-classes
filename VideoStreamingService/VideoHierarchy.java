/**
 * Abstract base class representing any video content in the streaming service.
 * All videos share common properties: title and duration in minutes.
 * Concrete subclasses (TvSeries, Movie) extend this class and add type-specific details.
 */
abstract class Video {

    private final String title;
    private final int durationMinutes;

    /**
     * Constructs a new Video with the specified title and duration.
     *
     * @param title           the title of the video
     * @param durationMinutes the total duration in minutes (must be positive)
     */
    public Video(String title, int durationMinutes) {
        if (title == null || title.trim().isEmpty()) {
            throw new IllegalArgumentException("Title cannot be null or empty");
        }
        if (durationMinutes <= 0) {
            throw new IllegalArgumentException("Duration must be positive");
        }
        this.title = title.trim();
        this.durationMinutes = durationMinutes;
    }

    /**
     * Returns a formatted string with the common video properties.
     * Subclasses should override this method to append type-specific information.
     *
     * @return a readable string representation of the video's common properties
     */
    public String getInfo() {
        return String.format("Title: \"%s\" | Duration: %d min", title, durationMinutes);
    }

    // Getters – useful for future extensions (search, filtering, recommendations, etc.)
    public String getTitle() {
        return title;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }
}

/**
 * Represents a TV series consisting of multiple episodes.
 */
class TvSeries extends Video {

    private final int episodeCount;

    /**
     * Constructs a TV Series with the specified title, episode duration, and total episode count.
     *
     * @param title           series title
     * @param durationMinutes typical duration of one episode in minutes
     * @param episodeCount    total number of episodes in the series
     */
    public TvSeries(String title, int durationMinutes, int episodeCount) {
        super(title, durationMinutes);
        if (episodeCount <= 0) {
            throw new IllegalArgumentException("Episode count must be positive");
        }
        this.episodeCount = episodeCount;
    }

    /**
     * Returns video information including series-specific details (type and episode count).
     *
     * @return formatted string with all properties + type + episodes
     */
    @Override
    public String getInfo() {
        return super.getInfo() +
               String.format(" | Type: TV Series | Episodes: %d", episodeCount);
    }

    public int getEpisodeCount() {
        return episodeCount;
    }
}

/**
 * Represents a single standalone movie.
 */
class Movie extends Video {

    private final double rating;

    /**
     * Constructs a Movie with the specified title, duration, and rating.
     *
     * @param title           movie title
     * @param durationMinutes total runtime in minutes
     * @param rating          average/user rating (typically 0.0–10.0)
     */
    public Movie(String title, int durationMinutes, double rating) {
        super(title, durationMinutes);
        if (rating < 0.0 || rating > 10.0) {
            throw new IllegalArgumentException("Rating must be between 0.0 and 10.0");
        }
        this.rating = rating;
    }

    /**
     * Returns video information including movie-specific details (type and rating).
     * Rating is formatted to one decimal place.
     *
     * @return formatted string with all properties + type + rating
     */
    @Override
    public String getInfo() {
        return super.getInfo() +
               String.format(" | Type: Movie | Rating: %.1f", rating);
    }

    public double getRating() {
        return rating;
    }
}

/**
 * Demonstration of the video hierarchy and polymorphic behavior.
 */
public class VideoHierarchy {

    public static void main(String[] args) {
        Video series = new TvSeries("Breaking Bad", 47, 62);
        Video movie  = new Movie("Inception", 148, 8.8);
        Video shortFilm = new Movie("Pi", 84, 7.4);

        // Polymorphic calls – each uses its own overridden getInfo()
        System.out.println(series.getInfo());
        System.out.println(movie.getInfo());
        System.out.println(shortFilm.getInfo());

        // Optional: showing access to subclass-specific properties
        if (series instanceof TvSeries tv) {
            System.out.printf("  → Total episodes: %d%n", tv.getEpisodeCount());
        }
        if (movie instanceof Movie m) {
            System.out.printf("  → IMDb-style rating: %.1f/10%n", m.getRating());
        }
    }
}

// Note: The main method serves as a demonstration of the class hierarchy and polymorphism.