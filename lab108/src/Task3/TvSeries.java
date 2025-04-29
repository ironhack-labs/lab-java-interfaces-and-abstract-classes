package Task3;

public class TvSeries extends Video{
    public int episodes;

    public TvSeries(String title, int duration, int episodes) {
        super(title, duration);
        this.episodes = episodes;
    }

    @Override
    public String getInfo() {
        return "These are the properties of TvSeries: " + this.title + this.duration + this.episodes;
    }
}
