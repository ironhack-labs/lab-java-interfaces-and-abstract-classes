abstract class Video {

    //Create an abstract class named Video and define the following properties and behaviors:
    //    title: a String representing the title of the video
    //    duration: an int representing the duration of the video in minutes
    //    getInfo(): a method that returns a String containing all of the video's properties in a readable format

    public String title;
    public int duration;

    public Video(String title, int duration) {
        this.title = title;
        this.duration = duration;

    }

    public abstract String getInfo();



}
