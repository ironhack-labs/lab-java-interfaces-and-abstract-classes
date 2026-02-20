package org.example;

public class TvSeries extends Video {
    int episodes;


    public TvSeries(String tittle, int duration,int episodes) {
        super(tittle, duration);
        this.episodes=episodes;
    }

    public String getinfo(){
        return getTittle()+" "+getDuration()+" ,"+episodes;
    }
}
