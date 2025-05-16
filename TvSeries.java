public class TvSeries extends Video {
    int episodes;
    public TvSeries(String title, int duration, int episodes) {
        super(title, duration);
        this.episodes = episodes;


    }

    @Override
    public String getInfo() {
        String stringGetinfo = super.toString();
        return  "Tv Series: " + stringGetinfo + " Number of episodes: " + episodes;
    }

}

