package VideoStreaming;

public class TVSeries extends Video{
    private int episodes;

    public TVSeries(int duration, String title, int episodes) {
        super(duration, title);
        this.episodes = episodes;
    }

    @Override
    public String getInfo(){
        String info = "Our video's title is "+ getTitle() + " duration equals to " + getDuration() + "episdoes amount is " + episodes;
        return info;
    }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }
}
