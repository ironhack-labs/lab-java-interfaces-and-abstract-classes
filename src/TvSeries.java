
//Create two classes that extend Video: TvSeries and Movie.
//TvSeries objects should have an additional episodes property, an int representing the number of episodes in the series.
//Movie objects should have an additional rating property, a double representing the rating of the movie.
public class TvSeries extends Video{

    private int episodes;

    public TvSeries(String title, int duration, int episodes) {
        super(title, duration);
        this.episodes = episodes;
    }


    public String getInfo() {
        return super.getInfo() + "\n Number of episodes: " +episodes;
    }
}
