package videostreamingservice;

public abstract class Video {
    public String title;
    public int duration;

    public String getInfo() {
        return "Title: " + title
                + "\nDuration: "
                + duration + " minutes";
    }
}
