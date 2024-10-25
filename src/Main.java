import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {


// Activity 1
// Create a method that accepts a BigDecimal and returns a double of the BigDecimal number rounded to the nearest hundredth. For example, 4.2545 should return 4.25

        BigDecimal a = new BigDecimal(10);
        BigDecimal b = new BigDecimal(3);

        BigDecimal sum = a.add(b);
        BigDecimal sub = a.subtract(b);
        BigDecimal multiply = a.multiply(b);
        BigDecimal divide = a.divide(b, 2, BigDecimal.ROUND_UP);

        System.out.println(divide);

// create a method that accepts a BigDecimal, reverses the sign (if the parameter is positive, the result should be negative and vice versa),
// rounds the number to the nearest tenth and returns the result. For example, 1.2345 should return -1.2 and -45.67 should return 45.7.

        BigDecimal c = new BigDecimal(10);
        BigDecimal d = new BigDecimal(5);

        BigDecimal sum2 = c.add(d);
        BigDecimal sub2 = c.subtract(d);
        BigDecimal multiply2 = c.multiply(d);
        BigDecimal divide2 = c.divide(d, 2, BigDecimal.ROUND_UP);

        System.out.println(divide2.negate());


// Activity 2

        Car sedanCar1 = new Sedan(" FDVG", 20000, " C1");
        String sedanInfo = sedanCar1.getInfo();
        System.out.println(sedanInfo);

        Car truck1 = new Truck("Tesla", 0, "Cyber Truck", 1000.00);
        String truckInfo = truck1.getInfo();
        System.out.println(truckInfo);




 // Activity 3

        TvSeries TvSerie1 = new TvSeries( 45, "Games of Thrones", 73);
                String serieInfo = TvSerie1.getInfo();
                System.out.println(serieInfo);



    };

}
