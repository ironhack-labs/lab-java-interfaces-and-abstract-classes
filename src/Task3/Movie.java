package Task3;

public class Movie extends Video {

    private double rating;

    public Movie(String title, int duration, double rating) {
        super(title, duration);
        this.rating = rating;
    }

    @Override
    public String getInfo() {
        return "Movie: " + super.getInfo() + ", Rating=" + rating;
    }

    @Override
    public void play() {
        System.out.println("Playing Movie: " + title);
    }

    @Override
    public void pause() {
        System.out.println("Pausing Movie: " + title);
    }
}