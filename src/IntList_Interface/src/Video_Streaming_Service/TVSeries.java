package IntList_Interface.src.Video_Streaming_Service;

public class TVSeries  extends Video {

    public TVSeries(String title, int duration) {
        super(title, duration);
    }

    private int episodes;

    public TVSeries(String title, int duration, int episodes) {
        super(title, duration);
        this.episodes = episodes;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }
}
