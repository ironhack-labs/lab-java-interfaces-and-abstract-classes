package videoStreamingService;

public class TvSeries extends Video {
    private int episodes;
    public TvSeries(String title, int duration) {
        super(title, duration);
        this.episodes = getEpisodes();
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    @Override
    public String getInfo() {
        return "Title: " + getTitle() + "\nDuration: " + getDuration() + " minutes\nType: TV Series\nEpisodes: " + episodes;
    }
}
