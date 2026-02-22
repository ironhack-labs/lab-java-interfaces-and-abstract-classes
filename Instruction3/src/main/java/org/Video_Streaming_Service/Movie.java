package org.Video_Streaming_Service;

public class Movie extends Video{
    double rating;
    public Movie(String title,int duration,double rating){
        super(title,duration);
        this.rating=rating;
    }
    public double getRating(){
        return rating;
    }
    public void setRating(double rating ){
        if(rating >= 0 && rating <=10){
            this.rating=rating;
        }
        else{
            this.rating= -1;
            System.err.println("Invalid rating .Please rate again.");
        }
    }
    @Override
    public String getInfo(){
        return String.format("-------------------\n"+"Title : " + getTitle()+"\n Duration time is "+ getDuration() + "Minutes\n"+"Rate : "+getRating());
    }
}
