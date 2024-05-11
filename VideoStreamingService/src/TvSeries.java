//Create two classes that extend Video: TvSeries and Movie.

public class TvSeries extends Video {
    public TvSeries(String title, int duration,int episodes) {
        super(title, duration);
        this.episodes = episodes;
    }


    //TvSeries objects should have an additional episodes property,
    // an int representing the number of episodes in the series.

    public int episodes;

    public int getEpisodes() {
        return episodes;
    }


    @Override
    public String getInfo() {
        return "Tv Serie\n" +
                "Title: " + title +
                "\nEpisodes: " + episodes +
                "\nDuration: " + duration +
                " min\n";
    }
}