package com.practice2.video;

public abstract class Video {
    private String title;
    private int duration;

    public Video (String title, int duration){
        this.title = title;
        this.duration = duration;
    }

    public String getInfo(){
        return "TITLE :" + title +
                "DURATION :" + duration;

    }

}
