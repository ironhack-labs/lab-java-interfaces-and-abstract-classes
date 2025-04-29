package Task3;

public abstract class Video {
    public String title;
    public int duration;

    public Video(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public abstract String getInfo();
}