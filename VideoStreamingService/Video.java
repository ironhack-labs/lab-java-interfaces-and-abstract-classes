package VideoStreamingService;

abstract class Video {
    String title;
    int duration;

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

    public String getInfo() {
        return "Title: "+ title +" duration:"+duration;

    }


}
