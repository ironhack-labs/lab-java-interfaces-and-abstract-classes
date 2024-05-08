public class TvSeries extends Video {

    private int episodes;


    public TvSeries(String title, int duration, int episodes) {
        super(title, duration);
        this.episodes = episodes;
    }

    public int getEpisodes() {
        return episodes;
    }

    public boolean getInfo() {
        System.out.println("Title: " + getTitle());
        System.out.println("Duration: " + getDuration());
        System.out.println("Episodes: " + getEpisodes());
        return false;
    }
}
