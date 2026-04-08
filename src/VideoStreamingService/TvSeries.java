package VideoStreamingService;

public class TvSeries extends Video {
    private int episodes;

    public TvSeries(String TITLE, int DURATION, int episodes){
        super(TITLE, DURATION);
        this.episodes = episodes;
    }

    public TvSeries(String title, int duration) {

        super(title, duration);
    }

    @Override
    public String getInfo(){
        return "🎬Title: " + getTITLE() + "\n⏲Duration: " + getDURATION() + "\n🎞Episodes: " + episodes;
    }
}
