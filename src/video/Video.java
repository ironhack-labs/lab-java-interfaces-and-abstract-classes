package src.video;

public abstract class Video {
    String title;
    int duration;

    public Video(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getInfo() {
        return String.format("Title: %s, Duration: %d minutes", this.title, this.duration);
    }
}
