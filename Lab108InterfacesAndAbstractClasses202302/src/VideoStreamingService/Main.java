package VideoStreamingService;

public class Main {
    public static void main(String[] args) {

        TvSeries breakingBad = new TvSeries("Breaking Bad", 3000, 62);
        Movie strayDog = new Movie("Stray Dog", 122, 8);
        System.out.println(breakingBad + "\n" + strayDog);

    }
}
