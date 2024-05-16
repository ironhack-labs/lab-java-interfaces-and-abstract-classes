import Video.video;

public abstract class Videos {
    public static void main(String[] args) {
    }
    String title;
    int duration;
    public Videos(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }
    public String getTitle() {
        return title;
    }
    public int getDuration() {
        return duration;
    }
    public abstract void play();

}
public void main() {
}
public class TvSeries extends video {
    private int episodes;
    public TvSeries(String title, int duration) {
        super(title, duration);
        this.episodes = episodes;
    }
    public int getEpisodes() {
        return episodes;
    }



    public class Movie extends video {
        private int episodes;

        public Movie(String title, int duration) {
            super(title, duration);

            Movie movie = this;
            episodes = episodes;

        }
        public int getEpisodes() {
            return episodes;
        }
    }

    }
