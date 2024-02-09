package src.video;

public class TvSeries extends Video {
    private int episodes;
    public TvSeries(String title, int duration, int episodes) {
        super(title, duration);
        setEpisodes(episodes);
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }
    public String getInfo() {
        return String.format("%s, Number of episodes: %d", super.getInfo(), this.episodes);
    }
}
