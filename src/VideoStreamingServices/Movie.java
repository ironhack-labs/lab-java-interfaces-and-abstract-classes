package VideoStreamingServices;

public class Movie extends Video{
    double rating;
    public Movie(String title, int duration,double rating){
        super(title,duration);
        this.rating=rating;
    }
    public void getInfo() {
        System.out.println("Title: " + getTitle() + "\n" + "Duration: " + getDuration() + " minutes"
                + "\n" + "Rating: " + getRating());
    }
    public double getRating(){
        return rating;
     }
    public void setRating(double rating){
        if (rating<1.0){
            System.out.println("Lowest rate is 1!");
        }
        else if
            (rating>10.0){
            System.out.println("Highest rate is 10!");
        }
       else {
           this.rating = rating;
    }
    }
}
