public class Movies extends Video{

    public double rating;

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public Movies(String title, int duration, double rating) {
        super(title, duration);
        this.rating = rating;
    }
}
