package VideoStreaming;

public class Main {
    public static void main(String[] args) {
        Video movies = new Movies("Rambo 2",  90, 7.10);
        Video tvseries = new TvSeries("The Soprano", 60, 60);

        System.out.println(movies.getInfo());
        System.out.println(tvseries.getInfo());
    }
}
