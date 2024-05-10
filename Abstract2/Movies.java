package Abstract2;

public class Movies extends Video{
   private double rating;

    public void setRating(double rating) {
        this.rating = rating;
    }

    public Movies(String title, int duration) {
        super(title, duration);
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String getInfo() {
        return  "Title: " + this.getTitle() + ", Duration: " + this.getDuration() + ", Rating: " + this.getRating();
    }
}
