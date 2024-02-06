package VideoStreamingService;

public class TvSeries extends Video {

    public TvSeries(String title, int duration, int episodes ) {
        super(title, duration);
        this.episodes =episodes ;
    }

    public int getEpisodesQuantity() {
        return episodes ;
    }

    public void setEpisodesQuantity(int episodesQuantity) {
        this.episodes  = episodes ;
    }


    @Override
    String getInfo() {
        return String.format("Title: %s\nDuration: %d minutes\nEpisodes: %d", title, duration, episodes);
    }

    private int episodes ;
}