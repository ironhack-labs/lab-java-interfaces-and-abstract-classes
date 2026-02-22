package Video_Streaming_Service;

public abstract class Video {

    private String title;
    private int duration;

    public String getInfo(){

        return "title is " + this.title + "\nduration"+ duration; 

    }
}
