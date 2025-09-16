package streamingService;

public class TvSeries extends Video {
    int episodes;

    TvSeries(String title, int duration, int episodes) {
        super(title, duration);
        this.episodes = episodes;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    @Override
    public String getInfo() {
        return "Title: " + title + ", duration: " + duration + ", episodes: " + episodes;
    }
}
