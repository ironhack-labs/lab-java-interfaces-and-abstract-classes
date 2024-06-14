import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        BigDecimal roundThis = new BigDecimal("4.2545");
        System.out.println(rounded(roundThis));
        BigDecimal reverseThis = new BigDecimal("-45.67");
        System.out.println(reverse(reverseThis));

        Movie movie = new Movie("Awesome", 100, 5.0);
        System.out.println(movie.getInfo());
    }

    public static double rounded(BigDecimal round){
        return round.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    public static BigDecimal reverse(BigDecimal signed){
        return signed.setScale(1, BigDecimal.ROUND_HALF_UP).multiply(BigDecimal.valueOf(-1));

    }
}
