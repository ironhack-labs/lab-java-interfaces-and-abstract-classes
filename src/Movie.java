


//Movie objects should have an additional rating property, a double representing the rating of the movie.

public class Movie extends Video{

    private double rating;

    public Movie(String title, int duration, double rating) {
        super(title, duration);
        this.rating = rating;
    }


    public String getInfo() {
        return  super.getInfo() + "\n Rating: " + rating;
    }
}
