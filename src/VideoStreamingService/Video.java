package VideoStreamingService;

abstract class Video {
    String Title;
    int duration;


    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }
    public String getInfo(){
        return " Title "+Title+" duration "+duration;
    }

}
