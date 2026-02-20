package com.ironhack;

public class Movie extends Video{
     double rating;

     public Movie(String tittle,int duration,double rating){
         super(tittle, duration);
         this.rating=rating;
     }

     @Override
     public String getInfo(){
         return super.getInfo()+"Rating:"+rating;
     }
}
