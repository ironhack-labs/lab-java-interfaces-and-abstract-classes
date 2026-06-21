public abstract class Video {
    protected String title;
    protected int duration; // in minutes

    public Video(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getInfo() {
        return String.format("Title: %s, Duration: %d minutes", title, duration);
    }
}
