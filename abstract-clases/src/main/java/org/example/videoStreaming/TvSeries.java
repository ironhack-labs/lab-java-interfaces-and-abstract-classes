package org.example.videoStreaming;

public class TvSeries extends Video {
    int episodes;

    public TvSeries(String title, int duration,int episodes){
        super(title,duration);
        setEpisodes(episodes);
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public String getInfo(){
        return "Serie: "+getTitle()+" de "+getDuration()+" minutos de duración y con un total de "+getEpisodes()+" episodios";
    }
}