
import java.security.Provider;

public class TvSeries extends Video{

    private int episode;
    public TvSeries(String title, int duration, Provider provider , int episode) {
        super(title, duration, provider);
        this.episode = episode;
    }
}