public class TvSeries extends Video {

   private int episodes;

    public TvSeries(int duration, String title, int episodes) {
        super(duration, title);
        this.episodes = episodes;
    }
}
