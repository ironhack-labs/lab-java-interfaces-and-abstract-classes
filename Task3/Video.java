package Task3;

abstract class Video {
    String title;
    int duration;

    String getInfo(){
        return "Title: " + title + "\nDuration: " + duration + " Minutes";
    }
}
