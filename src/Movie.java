public class Movie extends Video{

    private double rating;

    public Movie(String title, int duration, double rating){
        super(title, duration);
        setRating(rating);
    }

    //SETTERS
    public void setRating(double rating) {
        this.rating = rating;
    }

    //GETTERS
    public double getRating() {
        return this.rating;
    }

    //FUNCTIONS

    public String getInfo(){
        String info;
        info = "Movie information\nTitle: " + getTitle() + "\n" + "Duration: " +
                getDuration() + "\n" + "Rating: " + getRating() + "\n";
        return (info);
    }
}
