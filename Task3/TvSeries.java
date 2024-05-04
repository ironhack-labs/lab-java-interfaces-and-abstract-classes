package Task3;

public class TvSeries extends Video {
    int episodes;

    @Override
    String getInfo() {
        var episodesMessage = super.getInfo();
        return episodesMessage + "\nNumber of episodes: " + episodes;
    }
}
