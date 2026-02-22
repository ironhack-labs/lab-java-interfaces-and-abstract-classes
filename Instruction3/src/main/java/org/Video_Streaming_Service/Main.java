package org.Video_Streaming_Service;
//Video Streaming Service
public class Main {
    public static void main(String[] args) {


    Movie video1= new Movie("Parasite",132,9.3);
    TvSeries video2 = new TvSeries("Peaky Blinders" ,560,36);
    video1.setRating(11);
    System.out.println(video2.getInfo());
    System.out.println(video1.getInfo());
}}
