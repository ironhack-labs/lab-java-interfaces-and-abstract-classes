public abstract class Video {
    private String title;
    private int duration; //in minutes

    public Video(String title, int duration) {
        setTitle(title);
        setDuration(duration);
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    // method returning a String containing all video's properties in a readable format
    public String getInfo() {
        return ("Title: " + title + "\nDuration: " + duration);
    }
}
