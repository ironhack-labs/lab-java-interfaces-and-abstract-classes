//Create two classes that extend Video: TvSeries and Movie.

public class Movies extends Video {
    public Movies(String title, int duration, double rating) {
        super(title, duration);
        this.rating = rating;
    }

    //Movie objects should have an additional rating property, a double representing
    // the rating of the movie.

    public double rating;

    public double getRating() {
        return rating;
    }

    @Override
    public String getInfo() {
        return "Movie\n" +
                "Title: " + title +
                "\nRating: " + rating +
                "\nDuration: " + duration +
                " min\n";
    }
}
