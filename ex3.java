public class ex3 {
    public static void main(String[] args){
        Movies peli = new Movies("Silence of the lamb", 90);
        peli.setRating(1.2);
        peli.getInfo();


    }
}

abstract class Video{
    private String title;
    private int duration;

    public Video(String title, int duration) {
        setTitle(title);
        setDuration(duration);
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

    public void getInfo(){
        System.out.println(
                "Title: " + getTitle() + "\n" +
                        "Duration: " + getDuration()
        );
    }
}

class TvSeries extends Video{
    private int episodes;
    public TvSeries(String title, int duration){
        super(title, duration);
        setEpisodes(episodes);
    }

    public void setEpisodes(int episodes){
        this.episodes = episodes;
    }

    public int getEpisodes(int episodes){
        return this.episodes;
    }
}

class Movies extends Video{
    private double rating;
    public Movies(String title, int duration){
        super(title, duration);
        setRating(rating);
    }

    public void setRating(double rating){
        this.rating = rating;
    }

    public double getRating(double rating){
        return this.rating;
    }
}
