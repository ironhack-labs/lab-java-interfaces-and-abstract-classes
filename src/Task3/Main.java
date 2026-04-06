package Task3;

public class Main {
    public static void main(String[] args) {

        TvSeries series = new TvSeries("Breaking Bad", 50, 62);
        Movie movie = new Movie("Seven Samurai", 148, 8.8);

        System.out.println(series.getInfo());
        series.play();
        series.pause();

        System.out.println();

        System.out.println(movie.getInfo());
        movie.play();
        movie.pause();
    }
}