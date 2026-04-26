package com.practice2.video;

public class TvSeries extends Video{
    private int episodes;

    public TvSeries(String title, int duration, int episodes){
        super(title,duration);
        this.episodes = episodes;
    }

}
