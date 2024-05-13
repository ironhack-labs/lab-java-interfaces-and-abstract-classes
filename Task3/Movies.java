package Task3;

public class Movies extends Video {
    private double rating;


    public Movies(String title, int duration, double rating) {
        super(title, duration);
        this.rating = rating;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Rating :" + rating ;
    }
}
