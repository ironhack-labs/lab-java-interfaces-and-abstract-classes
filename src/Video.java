abstract class Video {
    private String title;
    private int duration;

    //CONSTRUCTOR
    public Video (String title, int duration) {

        setTitle(title);
        setDuration(duration);

    }

    //SETTERS
    public void setTitle(String title) {
        this.title = title;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }

    //GETTERS
    public String getTitle() {
        return this.title;
    }
    public int getDuration() {
        return this.duration;
    }


    //FUNCTIONS
    abstract String getInfo();
}

