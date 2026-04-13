package com.ironhack;

/**
 * Clase abstracta para servicios de video.
 */
public abstract class Video {
    private String title;
    private int duration;

    public Video(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public abstract String getInfo();

    public String getTitle() { return title; }
    public int getDuration() { return duration; }
}

class TvSeries extends Video {
    private int episodes;

    public TvSeries(String title, int duration, int episodes) {
        super(title, duration);
        this.episodes = episodes;
    }

    @Override
    public String getInfo() {
        return "Serie: " + getTitle() + " | Duración: " + getDuration() + "m | Episodios: " + episodes;
    }
}

class Movie extends Video {
    private double rating;

    public Movie(String title, int duration, double rating) {
        super(title, duration);
        this.rating = rating;
    }

    @Override
    public String getInfo() {
        return "Película: " + getTitle() + " | Duración: " + getDuration() + "m | Rating: " + rating + "/10";
    }
}