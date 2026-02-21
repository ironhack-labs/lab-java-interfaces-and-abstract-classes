package org.example;

public class TvSeries extends Video{
    private int episodes;
    public TvSeries(String title, int duration, int episodes){
        super(title,duration);
        this.episodes = episodes;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        if(episodes<1){
            System.out.println("This series has 0 episodes.");
        } else {
            this.episodes = episodes;
        }
    }
    public String getInfo(){
        return super.getInfo()+" || this serie has "+ episodes + " episodes.";
    }
}
