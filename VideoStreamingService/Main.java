package VideoStreamingService;

public class Main {
    public static void main(String[] args) {
        Movie film = new Movie();
        film.setDuration(120);
        film.setTitle("Deadpool 3");
        film.setRating(10);
        System.out.println(film.getInfo()+" rating:" + film.getRating());

        TvSeries series = new TvSeries();
        series.setTitle("Clarkson's Farm");
        series.setEpisodes(20);
        series.setDuration(1000);
        System.out.println(series.getInfo()+" episodes:" + series.getEpisodes());
    }
}
