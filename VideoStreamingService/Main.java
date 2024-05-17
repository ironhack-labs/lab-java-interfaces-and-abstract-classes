package VideoStreamingService;

public class Main {
    public static void main(String[] args) {
        TvSeries tv1 = new TvSeries("Friends", 44, 134);
        Movie mov1 = new Movie("Eat, Pray, Love", 133, 7.1);

        System.out.println(tv1.getInfo());
        System.out.println(mov1.getInfo());
    }
}
