package VideoStreamingService;

public class TvSeries extends Video {
    // Constructors
    TvSeries(String title, int duration, int episodes) {
        super(title, duration);
        setEpisodes(episodes);
    }

    // Attributes
    private int episodes;

    // Getters and Setters
    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    // Methods
    @Override
    public String getInfo() {
        return getTitle() + " (" + getDuration() + " minutes) - " + getEpisodes() + " episodes";
    }
}
