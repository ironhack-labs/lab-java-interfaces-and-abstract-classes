package com.ServiceVideoStreaming;

public class TvSeries  extends Video{
        private int episodes = 0;

        public TvSeries(String title, int duration){
            super(title, duration);
        }

    public int getEpisodes() {
        return episodes;
    }

    public void setEpisodes(int episodes) {
        this.episodes = episodes;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\n" +
                "Episodes : " + getEpisodes();
    }
}
