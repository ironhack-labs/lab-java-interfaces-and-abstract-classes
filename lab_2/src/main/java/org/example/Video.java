package org.example;

public abstract class Video {
    private String title;
    private int duration;

    public Video(String title, int duration) {
        setDuration(duration);
        setTitle(title);
    }

//    Getters
    public String getTitle() {
        return title;
    }
    public int getDuration() {
        return duration;
    }

//    Setters
    public void setTitle(String title) {
        this.title = title;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }

//    Methods
    public String getInfo() {
        return "Title: " + title + "\nDuration: " + duration;
    }
}
