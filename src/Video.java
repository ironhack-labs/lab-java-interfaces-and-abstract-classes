public abstract class Video {

    String title;
    int duration;



    public Video(int duration, String title) {
        this.duration = duration;
        this.title = title;


    }

    public String getInfo () {
        return "The title is " + title + " the duration is " + duration;
    }

}
