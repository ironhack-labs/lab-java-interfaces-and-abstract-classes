public class TvSeries extends Video{
    int episodes;

    public TvSeries(String title, int duration, int episodes) {
        super(title, duration);
        this.episodes = episodes;
    }

    @Override
    public String getInfo() {
        return "TV Series - Title: " + title + ", Duration: " + duration + " minutes, Episodes: " + episodes;
    }

    // Getter for episodes
    public int getEpisodes() {
        return episodes;
    }
}
