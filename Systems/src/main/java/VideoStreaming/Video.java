package VideoStreaming;

public abstract class Video {
    private String title;
    private int duration;


    public Video(int duration, String title) {
        this.duration = duration;
        this.title = title;
    }

    public String getInfo(){
        String info = "Our video's title is "+ title + " duration equals to " + duration;
        return info;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }



    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
