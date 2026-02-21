package org.example.videostreamingservicetask;

public abstract class Video {
    private String title;
    private int duration;

    public Video(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getInfo(){
        return "Film name: " + title + "\n" +
                "Duration: " + duration + " \n";
    }

    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }
}
