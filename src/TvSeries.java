public class TvSeries extends Video {
    private int numberOfEpisodes;

    //Constructor

    public TvSeries(String title, int duration, int numberOfEpisodes) {
        super(title, duration);
        this.numberOfEpisodes = numberOfEpisodes;

    }

    //OVerrride

    @Override
    public String getInfo() {
        return "Title of the Tv Series: " + title + ";" + "The series lasts " + duration + " minutes each episode " + ";" + "Number of Episodes: " + numberOfEpisodes + " per season";
    }


    //TvSeries objects should have an additional episodes property,
    // an int representing the number of episodes in the series.

}
