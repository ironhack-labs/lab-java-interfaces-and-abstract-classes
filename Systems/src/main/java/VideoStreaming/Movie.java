package VideoStreaming;

public class Movie extends Video {
    private double ratings;

    public Movie(int duration, String title, double ratings) {
        super(duration, title);
        this.ratings = ratings;
    }

    @Override
    public String getInfo(){
        String info = "Our video's title is "+ getTitle() + " duration equals to " + getDuration() + "rating is " + ratings;
        return info;
    }

    public double getRatings() {
        return ratings;
    }

    public void setRatings(double ratings) {
        this.ratings = ratings;
    }
}
