import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        // BigDecimal utilities demo
        BigDecimal bd1 = new BigDecimal("4.2545");
        System.out.println("Rounded to hundredths: " +
                BigDecimalUtils.roundToHundredths(bd1)); // 4.25

        BigDecimal bd2 = new BigDecimal("1.2345");
        System.out.println("Reverse sign & round to tenth: " +
                BigDecimalUtils.reverseSignAndRoundToTenth(bd2)); // -1.2

        // Car hierarchy demo
        Car sedan = new Sedan("1HGBH41JXMN109186", "Toyota", "Camry", 30000);
        System.out.println(sedan.getInfo());
        Car uv = new UtilityVehicle("2FTRX18W1XCA12345", "Ford", "Explorer", 45000, true);
        System.out.println(uv.getInfo());
        Car truck = new Truck("3C6UR5FL8GE123456", "RAM", "2500", 120000, 7500.0);
        System.out.println(truck.getInfo());

        // Video hierarchy demo
        Video series = new TvSeries("Stranger Things", 50, 25);
        System.out.println(series.getInfo());
        Video movie = new Movie("Inception", 148, 8.8);
        System.out.println(movie.getInfo());

        // IntList demos
        IntList arrayList = new IntArrayList();
        for (int i = 0; i < 12; i++) arrayList.add(i);
        System.out.println("IntArrayList[5] = " + arrayList.get(5));

        IntList vector = new IntVector();
        for (int i = 0; i < 25; i++) vector.add(i * 2);
        System.out.println("IntVector[20] = " + vector.get(20));
    }
}
