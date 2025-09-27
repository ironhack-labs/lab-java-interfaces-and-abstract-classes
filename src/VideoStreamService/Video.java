package VideoStreamService;

abstract class Video {
    protected String title;
    protected int duration;

    public Video(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public abstract String getInfo();

}

class TVSeries extends Video {
    private int episodes;

    public TVSeries(String title, int duration, int episodes){
        super(title, duration);
        this.episodes = episodes;
    }

    @Override
    public String getInfo(){
        return "TV Series: " + title + "\nDuration: " + duration + "minutes\nEpisodes: " + episodes;

    }
}

class Movie extends Video {
    private double rating;

    public Movie(String title, int duration, double rating) {
        super(title, duration);
        this.rating = rating;
    }

    @Override
    public String getInfo(){
        return "Movie: " + title + "\nDuration: " + duration + "minutes\nRating: " + rating;
    }
}

