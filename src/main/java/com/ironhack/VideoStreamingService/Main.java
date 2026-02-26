package com.ironhack.VideoStreamingService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Movie movie=new Movie("The Dark Knight ",152,9.0);

        TvSeries tvSeries=new TvSeries("Chernobyl ",60,5);


        System.out.println("About movie--> "+movie.getInfo());
        System.out.println("About tvSeries--> "+tvSeries.getInfo());



        
    }
}
