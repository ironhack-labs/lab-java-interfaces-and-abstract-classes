package VideoStreamingService;

public abstract class Video {
    private final String TITLE;
    private final int DURATION;

    public Video(String title, int duration) {
        this.TITLE = title;
        this.DURATION = duration;
    }

    public String getTITLE(){
        return TITLE;
    }

    public int getDURATION(){
        return DURATION;
    }

    public abstract String getInfo();
}
