package VideoStreamingService;

public class TvSeries extends Video{
    int episodes;

    public int getEpisodes() {

        return episodes;
    }

    public void setEpisodes(int episodes) {

        this.episodes = episodes;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + " episodes:" + getEpisodes();
    }
}
