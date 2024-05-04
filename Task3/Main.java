package Task3;

public class Main {
    public static void main(String[] args) {
        TvSeries serie1 = new TvSeries();
        serie1.title = "Dead Boy Detectives";
        serie1.duration = 52;
        serie1.episodes = 8;
        System.out.println(serie1.getInfo());

        System.out.println("/////////////////////////////////////////////////////////////");

        Movie movie1 = new Movie();
        movie1.title = "Silent Hill: Revelation";
        movie1.duration = 95;
        movie1.rating = 3.1;
        System.out.println(movie1.getInfo());
    }
}
