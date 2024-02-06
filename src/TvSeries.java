public class TvSeries extends Video{

    private int episodes;

    public TvSeries(String title, int duration, int episodes){
        super(title, duration);
        setEpisodes(episodes);
    }

    //SETTERS
    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    //GETTERS
    public int getEpisodes() {
        return this.episodes;
    }

    //FUNCTIONS
    public String getInfo(){
        String info;
        info = "TV series information\nTitle: " + getTitle() + "\n" + "Duration: " +
                getDuration() + "\n" + "Number of episodes: " + getEpisodes() + "\n";
        return (info);
    }

}
