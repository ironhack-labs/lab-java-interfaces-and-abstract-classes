
public class Movie extends Video{

    private final double rating;

    public Movie(String title, int duration, double rating) {
        super(title, duration);
        this.rating = rating;
    }


    public String getInfo() {
        return  super.getInfo() + "\n Rating: " + rating;
    }
}