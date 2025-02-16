package com.ironhack.lab108.streaming;

public class Main {
    public static void main(String[] args) {
        Video serieTv = new TvSeries("Flash", 30, 200);
        Video movie = new Movie("Avengers", 120, 4.4);

        serieTv.getInfo();
        movie.getInfo();
    }
}
