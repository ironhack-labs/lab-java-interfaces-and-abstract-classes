public class TvSeries extends Video{

    public int episodes;

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
}
