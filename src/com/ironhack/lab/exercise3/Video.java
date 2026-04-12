package com.ironhack.lab.exercise3;

public abstract class Video {
    private String title;
    private int duration;

    public Video(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    //Metodo getInfo
    public String getInfo() {
        return "Title: " + title +
                ", Duration: " + duration;
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return getInfo();
    }
}
