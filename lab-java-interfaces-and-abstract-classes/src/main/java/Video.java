public abstract class Video
{
    private final String title;
    private final int duration;

    public Video(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getInfo(){
        return "Title: " + title + ", Duration: " + duration;
    }// in seconds

}
