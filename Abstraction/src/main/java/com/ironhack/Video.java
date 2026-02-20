package com.ironhack;

public abstract class Video {
    String tittle;
    int duration;

    public Video(String tittle,int duration){
        this.duration=duration;
        this.tittle=tittle;
    }

    public String getInfo(){
        return "Tittle:"+tittle+"Duration"+duration;
    }
}
