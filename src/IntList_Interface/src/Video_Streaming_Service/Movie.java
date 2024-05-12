package IntList_Interface.src.Video_Streaming_Service;

public class Movie extends Video {

    public Movie(String title, int duration) {
        super(title, duration);
    }

    private double rating;

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
}
