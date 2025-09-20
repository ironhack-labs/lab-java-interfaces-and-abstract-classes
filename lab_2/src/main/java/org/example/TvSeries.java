package org.example;

public class TvSeries extends Video {
    private int episodes;

    public TvSeries(String title, int duration, int episodes) {
        super(title, duration);
        setEpisodes(episodes);
    }

//    Getter
    public int getEpisodes() {
        return episodes;
    }

//    Setter
    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    @Override
    public String getInfo() {
        String video = super.getInfo();
        episodes = getEpisodes();
        return video + "\nEpisodes: " + episodes;
    }
}
