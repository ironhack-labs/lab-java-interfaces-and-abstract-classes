
import java.security.Provider;

public class Movie extends Video {
    private int rating;
    public Movie (String title, int duration, Provider provider , int rating) {
        super(title, duration, provider);
        this.rating = rating;
    }
}


