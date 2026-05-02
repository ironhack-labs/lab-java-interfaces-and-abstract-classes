package VideoStreamingService;

public abstract class Video {
    private String title;
    private int duration; // in minuti

    public Video(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getInfo() {
        return String.format("Titolo: %s, Durata: %d min", title, duration);
    }
}