import java.math.BigDecimal;

public class ex1 {
    public static void main(String[] args){
        System.out.println("Ex1.1(): " + decimal_to_double(BigDecimal.valueOf(1.23555768323)));
        System.out.println("Ex1.2(): " + decimal_reverse(BigDecimal.valueOf(1.23555768323)));
    }

    public static double decimal_to_double(BigDecimal x){
        x = x.setScale(2, BigDecimal.ROUND_HALF_EVEN);
        return x.doubleValue();
    }

    public static double decimal_reverse(BigDecimal number){
        number = number.setScale(1, BigDecimal.ROUND_HALF_UP).multiply(BigDecimal.valueOf(-1));
        return number.doubleValue();
    }
}
