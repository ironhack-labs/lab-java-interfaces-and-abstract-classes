public class TvSeries extends Video{
    private int episodes;

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public TvSeries(String title, int duration, int episodes) {
        super(title, duration);
        this.episodes = episodes;
    }

    public String getInfo(){
        return "TvSeries info- title:"+getTitle()+" duration:"+getDuration()+" episodes:"+getEpisodes();
    }
}
