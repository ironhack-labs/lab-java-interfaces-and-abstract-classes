package Videostreaming;

public abstract class Video {
    String title;
    int duration;

    public Video(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public abstract String getInfo();
}
