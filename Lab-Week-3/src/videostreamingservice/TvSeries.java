package videostreamingservice;

public class TvSeries extends Video {
    private int numberOfEpisodes;

    public TvSeries(String title, int duration, int numberOfEpisodes) {
        this.title = title;
        this.duration = duration;
        this.numberOfEpisodes = numberOfEpisodes;
    }

    @Override
    public String toString() {
        return "TvSeries{" +
                ", title: '" + title + '\'' +
                ", duration: " + duration + " minutes " +
                "numberOfEpisodes: " + numberOfEpisodes +
                '}';
    }
}
