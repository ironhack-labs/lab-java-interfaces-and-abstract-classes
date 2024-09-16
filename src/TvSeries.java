public class TvSeries extends Video{

    private final int episodes;

    public TvSeries(String title, int duration, int episodes) {
        super(title, duration);
        this.episodes = episodes;
    }


    public String getInfo() {
        return super.getInfo() + "\n Number of episodes: " +episodes;
    }
}