public class Movie extends Video {
    private double rating; // rating of the movie
    public Movie(String title, int duration, double rating) {
        super(title, duration);
        setRating(rating);
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }

    // method returning a String containing all video's properties in a readable format
    public String getInfo() {
        return ("The properties of the movie are: \n Title: " + super.getTitle() + "\n Duration: " + super.getDuration() + "\n Rating: " + rating);
    }
}