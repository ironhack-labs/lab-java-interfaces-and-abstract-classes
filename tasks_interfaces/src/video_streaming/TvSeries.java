package video_streaming;

public class TvSeries extends Video{
    int episodes;
    public TvSeries(String title,int duration,int episodes){
        super(title,duration);
        this.episodes=episodes;
    }
    public int getEpisodes(){
        return this.episodes;
    }
    public String getInfo(){
        return ("Title is: "+getTitle()+", Duration is: "+getDuration()+", Number of episodes: "+getEpisodes());
    }
}
