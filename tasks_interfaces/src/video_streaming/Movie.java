package video_streaming;
public class Movie extends Video{
    double rating;
    public Movie(String title,int duration,double rating){
        super(title,duration);
        this.rating=rating;
    }
    public double getRating(){
        return this.rating;
    }
    public String getInfo(){
        return ("Title is: "+getTitle()+", Duration is: "+getDuration()+", Rating is: "+getRating());
    }
}