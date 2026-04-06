package Task3;

public class TvSeries extends Video {

    private int episodes;

    public TvSeries(String title, int duration, int episodes) {
        super(title, duration);
        this.episodes = episodes;
    }

    @Override
    public String getInfo() {
        return "TvSeries: " + super.getInfo() + ", Episodes=" + episodes;
    }

    @Override
    public void play() {
        System.out.println("Playing TV Series: " + title);
    }

    @Override
    public void pause() {
        System.out.println("Pausing TV Series: " + title);
    }
}