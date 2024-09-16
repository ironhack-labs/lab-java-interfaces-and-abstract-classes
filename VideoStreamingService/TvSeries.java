package VideoStreamingService;

public class TvSeries extends Video {

    private int episodes ;

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
        return String.format("Title: %s\nDuration: %d minutes\nEpisodes: %d", getTitle(), getDuration(), getEpisodesQuantity());
    }


}