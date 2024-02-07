public class TvSeries extends Video {
    private int episodes; // number of episodes in the series
    public TvSeries(String title, int duration, int episodes) {
        super(title, duration);
        setEpisodes(episodes);
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public int getEpisodes() {
        return episodes;
    }

    // method returning a String containing all video's properties in a readable format
    public String getInfo() {
        return ("The properties of the TV series are: \n Title: " + super.getTitle() + "\n Duration: " + super.getDuration() + "\n Episodes: " + episodes);
    }
}
