package videostreamingservice;

public class Movies extends Video {
    private double rating;

    public Movies(String title, int duration, int rating) {
        this.title = title;
        this.duration = duration;
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Movies{" +
                ", title: '" + title + '\'' +
                ", duration: " + duration + " minutes " +
                "rating: " + rating +
                '}';
    }
}
