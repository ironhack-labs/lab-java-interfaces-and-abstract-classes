package com.ironhack;


public class TvSeries extends Video{

    //TvSeries objects should have an additional episodes property,
    // //an int representing the number of episodes in the series.

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
    public String toString() {
        return "TvSeries{"+"title="+getTitle()+"," +
                " duration="+getDuration()+", " +
                "episodes="+episodes+"}";
    }
}


