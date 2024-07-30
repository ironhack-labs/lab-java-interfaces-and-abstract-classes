public class Movie extends Video{
    private double rating;

    public Movie(String title, int duration, double rating) {
        super(title, duration);
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "rating=" + rating +
                '}';
    }

    public Movie(String title, int duration) {
        super(title, duration);
    }

    @Override
    public String getTitle() {
        return super.getTitle();
    }

    @Override
    public void setTitle(String title) {
        super.setTitle(title);
    }

    @Override
    public int getDuration() {
        return super.getDuration();
    }

    @Override
    public void setDuration(int duration) {
        super.setDuration(duration);
    }
}
