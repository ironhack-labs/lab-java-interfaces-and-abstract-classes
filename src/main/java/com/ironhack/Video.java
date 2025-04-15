package com.ironhack;


public abstract class Video {

// a String representing the title of the video
private String title;

//an int representing the duration of the video in minutes
private int duration;

//a method that returns a String containing all  video's properties in a readable format


    public Video(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Video{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }
}
