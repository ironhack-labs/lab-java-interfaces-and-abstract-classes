package ServiceVideoStreaming;

public class Application {
    public static void main(String[] args) {

        Movie miPeli = new Movie("La vida es bella", 116, 8.6);

        TvSeries miSerie = new TvSeries("Pluribus", 50, 9);

        System.out.println("*--- INFO MOVIE ---*");
        System.out.println(miPeli.getInfo());

        System.out.println("\n*--- INFO SERIE ---*");
        System.out.println(miSerie.getInfo());
    }
}