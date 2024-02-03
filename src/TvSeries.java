public class TvSeries extends Video {

    int episodes;

    public TvSeries(String title, int duration, int episodes) {
        super(title, duration);
        setEpisodes(episodes);
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    @Override
    String getInfo() {
        return "{Title: " + getTitle() + " , Duration: " + getDuration() + " , Episodes: " + getEpisodes() + "}";
    }
}
