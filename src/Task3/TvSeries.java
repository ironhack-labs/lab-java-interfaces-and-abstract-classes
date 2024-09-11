package Task3;

public class TvSeries extends Video{

    private int Episodes;

    public TvSeries(String title, int duration, int episodes) {
        super(title, duration);
        Episodes = episodes;
    }

    public int getEpisodes() {
        return Episodes;
    }

    public void setEpisodes(int episodes) {
        Episodes = episodes;
    }

    @Override
    public String getInfo() {
        return "Title "+ getTitle()+" ,"+
                "Duration "+ getDuration()+ " ,"+
                "Episodes "+ getEpisodes()+" ,";
    }
}
