public class TvSeries extends Video {

    private int episodes;


    public TvSeries(String title, int duration, int episodes) {
        super(title, duration);
        setEpisodes(episodes);
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public String getInfo(){
        return "The TV Serie is: " + getTitle() + ", The Duration is: " + getDuration() + "min, And has: " + getEpisodes() + " episodes.";
    }
}
