package org.example;

public abstract class Video {
private String tittle;
int duration;


public Video(String tittle,int duration){
    this.tittle=tittle;
    this.duration=duration;
}
public String getinfo(){
    return tittle+" "+duration;
}

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
