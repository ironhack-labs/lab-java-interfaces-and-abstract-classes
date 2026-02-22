package com.ironhack.VideoStreamingService;

public abstract class Video {

    private String title;

    private int duration;

    public Video(String title, int duration) {
        setTitle(title);
        setDuration(duration);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null) {
            System.err.println("title can't be null");
        }
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        if (duration <= 0) {
            System.err.println("duration can't be negative");
        }
        this.duration = duration;
    }

    public String getInfo() {
        return "title: " + title+"," + " duration: " + duration+",";
    }
}
