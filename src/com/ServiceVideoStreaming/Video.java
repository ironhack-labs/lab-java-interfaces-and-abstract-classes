package com.ServiceVideoStreaming;

public abstract class Video {
    protected String title;
    protected int duration;

    public Video(String title, int duration) {
        setTitle(title);
        setDuration(duration);
    }

    //Getters
    public String getTitle() {
        return this.title;
    }
    public int getDuration() {
        return this.duration;
    }

    //Setters
    public void setTitle(String title) {
        this.title = title;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }

    //Methods
    public abstract String getInfo();
}

