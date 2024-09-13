package VideoStreamingService;

public class TvSeries extends Video{
    int numberOfEpisodes;

    public TvSeries(String title, int duration, int numberOfEpisodes) {
        super(title, duration);
        this.numberOfEpisodes = numberOfEpisodes;
    }

    public String getInfo() {
        return "The title of this TV series is \"" + title + "\". The duration of one episode is " + duration + " minutes, and it has " + numberOfEpisodes + " episodes.";
    }
}
