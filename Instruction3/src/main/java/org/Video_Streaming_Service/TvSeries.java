package org.Video_Streaming_Service;

public class TvSeries extends Video{
    int episodes;
    public TvSeries(String title, int duration,int episodes){
        super(title,duration);
        this.episodes=episodes;
    }
    public int getEpisodes(){
        return episodes;
    }
    public void setEpisodes(int episodes){
        this.episodes=episodes;
    }
    @Override
    public String getInfo(){
        return String.format("-------------------\n"+"Title : " + getTitle()+"\n Duration time is "+ getDuration() + "Minutes\n"+"Episodes : "+getEpisodes());
    }
}
