package com.ironhack.streaming;

public class TvSeries extends Video {
    private int episodes;


    public TvSeries(String title, int duration, int episodes) {
        super(title, duration);
        setEpisodes(episodes);
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\nEpisodes: " + getEpisodes();
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }
}
