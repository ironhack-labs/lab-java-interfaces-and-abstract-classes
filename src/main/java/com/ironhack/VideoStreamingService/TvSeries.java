package com.ironhack.VideoStreamingService;

public class TvSeries extends Video{

    private int episodes;

    public TvSeries(String title, int duration, int episodes) {
        super(title, duration);
        setEpisodes(episodes);
    }

    public int getEpisodes() {
        return episodes;
    }
    public void setEpisodes(int episodes) {
        if (episodes <= 0) {
            System.err.println("episodes can't be negative");
        }
        this.episodes = episodes;
    }

    @Override
    public String getInfo() {
        return super.getInfo()+" episodes: "+episodes;
    }
}
