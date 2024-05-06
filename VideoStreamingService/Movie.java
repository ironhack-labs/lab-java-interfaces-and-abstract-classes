package VideoStreamingService;

public class Movie extends Video{
    double rating;

    public double getRating() {

        return rating;
    }

    public void setRating(double rating) {

        this.rating = rating;
    }

    @Override
    public String getInfo() {
        return super.getInfo()+ " rating:" + getRating();
    }
}
