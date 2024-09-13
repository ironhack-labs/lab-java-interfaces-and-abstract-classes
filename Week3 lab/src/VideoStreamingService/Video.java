package VideoStreamingService;

public abstract class Video {
    String title;
    int duration;

    public String getInfo() {
        return "The title is \"" + title + "\", and the duration is " + duration + " minutes.";
    }

    public Video(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }
}