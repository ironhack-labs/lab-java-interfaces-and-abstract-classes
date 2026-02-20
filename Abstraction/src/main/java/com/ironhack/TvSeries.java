package com.ironhack;

public class TvSeries extends Video{
    int episodes;

    public TvSeries(String tittle,int duration,int episodes){
        super(tittle, duration);
        this.episodes=episodes;
    }

    @Override
    public String getInfo(){
        return super.getInfo()+"Episodes in the serie="+episodes;
    }


}
