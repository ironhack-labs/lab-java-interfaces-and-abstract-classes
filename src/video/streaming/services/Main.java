package video.streaming.services;

public class Main {

    public static void main(String[] args) {
        Movie movie1 = new Movie("Title1", 91, 6.5);
        System.out.println(movie1.getInfo());
        Movie movie2 = new Movie("Title2", 92, 7.5);
        System.out.println(movie2.getInfo());

        TvSeries tvSeries1 = new TvSeries("Serie1", 40, 10);
        System.out.println(tvSeries1.getInfo());
        TvSeries tvSeries2 = new TvSeries("Serie2", 25, 20);
        System.out.println(tvSeries2.getInfo());
    }
}
