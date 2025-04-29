package Task3;

public class Movie extends Video{
    public double rating;

    public Movie(String title, int duration, double rating) {
        super(title, duration);
        this.rating = rating;
    }

    @Override
    public String getInfo() {
        return "These are the properties of TvSeries: "+ this.title + this.duration + this.rating;
    }
}
