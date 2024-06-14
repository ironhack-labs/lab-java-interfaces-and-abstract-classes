public abstract class Video {
    private String title;
    private int duration;


    public Video(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    public Video() {
    }

    public String getInfo(){
        return "The video title is: " + title +
                "\nand its duration is: " + duration;
    }


}
