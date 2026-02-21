package org.example;

public class Movie extends Video {
    private double rating;
    public Movie(String title,int duration,double rating){
        super(title,duration);
        this.rating = rating;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        if(rating<1){
            System.out.println("What even is this??");
        } else {
            this.rating = rating;
        }
    }
    public String getInfo(){
        return super.getInfo()+" This movie is rated by: "+rating;
    }
}
