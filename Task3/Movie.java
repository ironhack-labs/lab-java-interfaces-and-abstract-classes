package Task3;

public class Movie extends Video {
    double rating;

    @Override
    String getInfo() {
        var ratingMessage = super.getInfo();
        return ratingMessage + "\nRating: " + rating;
    }
}
