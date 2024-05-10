package Abstract2;

public class TVSeries extends Video{
    private int episodes;

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    public TVSeries(String title, int duration) {
        super(title, duration);
    }

    public int getEpisode() {
        return episodes;
    }

    @Override
    public String getInfo() {
        return "Title: " + this.getTitle() + ", Duration: " + this.getDuration() + ", Episodes: " + this.getEpisode();
    }
}
