package video.streaming.services;

public class TvSeries extends Video {

    private int episodes;

    public TvSeries(String title, int duration, int episodes) {
        super(title, duration);
        setEpisodes(episodes);
    }

    @Override
    String getInfo() {
        return "Serie: " + "\n" +
                "title= " + getTitle() + "\n" +
                "duration= " + getDuration() + "\n" +
                "episodes= " + getEpisodes();
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

}
