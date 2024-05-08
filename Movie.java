public class Movie extends Video {

    private double rating;


    public Movie(String title, int duration, double rating) {
        super(title, duration);
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }

    public boolean getInfo() {
        System.out.println("Title: " + getTitle());
        System.out.println("Duration: " + getDuration());
        System.out.println("Rating: " + getRating());
        return false;
    }

}
