package videoStreaming;

public class TvSeries extends Video {
    private int episodes;
    public TvSeries(String title, int duration) {
        super(title, duration);
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    @Override
    public String getType() {
        return "TV Series";
    }
}
