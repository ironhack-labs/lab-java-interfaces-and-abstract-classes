public class Movie extends Video{
    private double rating;

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public Movie(String title, int duration) {
        super(title, duration);
    }

    public String getInfo(){
        return "TvSeries info- title:"+getTitle()+" duration:"+getDuration()+" rating:"+getRating();
    }

}
