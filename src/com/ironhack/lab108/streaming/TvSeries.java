package com.ironhack.lab108.streaming;

public class TvSeries extends Video{
    private int episodes;

    public TvSeries(String title, int duration, int episodes) {
        super(title, duration);
        this.episodes = episodes;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    @Override
    public void getInfo() {
        System.out.println("------------- Tv Serie Information -------------" +
                "\nTitle       : " + getTitle() +
                "\nDuration    : " + getDuration() + " min" +
                "\nEpisodes    : " + getEpisodes());
    }
}
