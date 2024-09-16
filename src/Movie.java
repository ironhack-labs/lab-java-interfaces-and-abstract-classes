public class Movie extends Video{

    private double rating;

    public Movie(String title, int duration, double rating) {
        super(title, duration);
        setRating(rating);
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        if (rating > 100) {
            this.rating = rating/10;
        } else if (rating < 10) {
            this.rating = rating*10;
        } else {
            this.rating = rating;
        }
    }

    public String getInfo(){
        return "The Movie is: " + getTitle() + ", The Duration is: " + getDuration() + "min, And the rating is: " + getRating() + "/100";
    }

}
