package VideoStreamingService;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creazione di una lista che può contenere qualsiasi tipo di Video
        List<Video> catalogo = new ArrayList<>();

        // 1. Creazione di un Movie (titolo, durata, rating)
        Movie devilDressPrada = new Movie("Il diavolo veste Prada", 121, 9);

        // 2. Creazione di una TvSeries (titolo, durata, episodi)
        TvSeries breakingBad = new TvSeries("Breaking Bad", 50, 62);

        // 3. Altro esempio di Movie
        Movie inception = new Movie("Inception", 148, 8.8);

        // Aggiunta al catalogo
        catalogo.add(devilDressPrada);
        catalogo.add(breakingBad);
        catalogo.add(inception);

        // Stampa delle informazioni di ogni video
        System.out.println("=== CATALOGO VIDEO ===");
        for (Video v : catalogo) {
            System.out.println(v.getInfo());
        }
    }
}