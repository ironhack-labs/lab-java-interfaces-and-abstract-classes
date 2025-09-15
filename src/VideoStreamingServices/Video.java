package VideoStreamingServices;

public abstract class Video {
    String title;
    int duration;
    public Video(String title, int duration){
        this.title= title;
        this.duration = duration;
    }
    public abstract void getInfo();
    public String getTitle(){
        return title;
    }
    public void setTitle(String title){
        this.title= title;
    }
    public int getDuration(){
        return duration;
    }
    public void setDuration(int duration){
        this.duration= duration;

    }
}
