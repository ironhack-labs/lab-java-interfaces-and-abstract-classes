package VideoStreamService;

public class Main {
    public static void main(String[] args) {
        TVSeries series = new TVSeries("Wednesday", 50, 16);
        Movie movie = new Movie("Halloween", 93, 7.7);

        System.out.println(series.getInfo());
        System.out.println();
        System.out.println(movie.getInfo());
    }
}
