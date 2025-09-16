package streamingService;

public abstract class Video {
    String title;
    int duration;

    Video (String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle (String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration (int duration) {
        this.duration = duration;
    }

    abstract String getInfo();
}
