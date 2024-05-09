package VideoStreamingService;

public abstract class Video {


    // Properties
    private String title;
    private int duration;


    // Methods
    public String getInfo() {
        return "Video{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }

}
