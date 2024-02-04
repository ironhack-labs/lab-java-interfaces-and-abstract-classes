package VideoStreamingService;

abstract class Video {
    // Constructor
    Video(String title, int duration) {
        setDuration(duration);
        setTitle(title);
    }

    // Attributes
    private String title;
    private int duration;

    // Getters and Setters
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = Math.max(0, duration);
    }

    // Methods
    public String getInfo() {
        return getTitle() + " (" + getDuration() + " minutes)";
    }
}
