package com.ironhack.streaming;

public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie("Inception", 148, 8.8);
        TvSeries series = new TvSeries("Breaking Bad", 60, 62);

        System.out.println(movie.getInfo());
        System.out.println(series.getInfo());
    }
}
