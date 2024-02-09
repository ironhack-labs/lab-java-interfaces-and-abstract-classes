import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Main {
    public void main(String[] args){
        BigDecimal a = new BigDecimal("2.3988756");
        System.out.println( getDouble(a));
        System.out.println(reverseSign(a));
        Sedan sedan = new Sedan("1234","2013","sedan-sed",1200);
        System.out.println(sedan.getInfo());
        Truck truck = new Truck("123456","2003","34hnb",3000,234566);
        System.out.println(truck.getInfo());


    }

    public static BigDecimal getDouble(BigDecimal bigDecimal){
        BigDecimal powTwo = bigDecimal.pow(2);
        return powTwo.setScale(2, RoundingMode.HALF_EVEN);
    }

    public static BigDecimal reverseSign(BigDecimal bigDecimal){
        BigDecimal oppositeValue = bigDecimal.negate();

        return oppositeValue.setScale(1, RoundingMode.HALF_EVEN);
    }

}
