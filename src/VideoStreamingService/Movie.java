package VideoStreamingService;

import javax.swing.*;

public class Movie extends Video {
    private double rating;

    public Movie(String title, int duration, double rating) {
        super(title, duration);
        this.rating = rating;
    }

    @Override
    public String getInfo() {
        return "🎬 Title: " + getTITLE() + "\n⏲ Duration: " + getDURATION() + "min" + "\nRating: " + rating + "⭐";
    }
}
