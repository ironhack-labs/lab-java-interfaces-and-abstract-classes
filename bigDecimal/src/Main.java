import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
            eje1 utils = new eje1();

        BigDecimal input = new BigDecimal("4.2545");
        double result = utils.roundToHundredth(input);

        System.out.println("Il numero arrotondato è: " + result);



    }
}