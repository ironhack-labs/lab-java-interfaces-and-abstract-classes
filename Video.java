public abstract class Video {
    String title;
    int duration;

    public Video(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

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
        this.duration = duration;
    }


    // GetInfo
    public String getInfo(){
        String getInfo = "";
        return  getInfo;
    }


    @Override
    public String toString() {
        return
                "Title: '" + title + '\'' +
                ", Duration: " + duration;
    }
}
