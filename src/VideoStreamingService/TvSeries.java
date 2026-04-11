package VideoStreamingService;

public class TvSeries extends Video {
    private int episode;


    public TvSeries(String title, int duration, int episode) {
        super(title, duration);
        this.episode = episode;
    }


    @Override
    public void getInfo() {
        System.out.println(getTitle() +  " has " + episode  + " episodes");
    }

    public int getEpisode() {
        return episode;
    }

    public void setEpisode(int episode) {
        this.episode = episode;
    }
}
