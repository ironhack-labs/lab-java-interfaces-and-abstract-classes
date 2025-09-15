package VideoStreamingServices;

public class TvSeries extends Video{
    int episodes;
    public TvSeries(String title, int duration, int episodes){
        super(title, duration);
        this.episodes = episodes;
    }
    public void getInfo(){
        System.out.println("Title: " + getTitle() + "\n" + "Duration: " +
                getDuration() + " minutes" + "\n"+"Number of episodes: " + getEpisodes());
    }
    public int getEpisodes(){
        return episodes;
    }
}
