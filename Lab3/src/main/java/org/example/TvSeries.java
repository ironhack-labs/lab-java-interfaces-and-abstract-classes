package org.example;

public class TvSeries extends Video{
    private int episodes;

    //constructor
    public TvSeries(String title,int duration,int episodes){
        super(title,duration);
        this.episodes = episodes;
    }

    //getters
    public int getEpisodes(){
        return episodes;
    }

    //setters
    public void setEpisodes(int episodes){
        this.episodes = episodes;
    }

    @Override
    public String getInfo(){
        return super.getInfo()
                +"\nEpisodes:"+episodes;
    }
}
