import java.math.BigDecimal;
import java.math.RoundingMode;

public class ArrotondamentoBigDecimal {

    public static void main(String[] args) {
        // Esempi di test
        System.out.println("Input 1.2345  -> Risultato: " + reverseAndRound(new BigDecimal("1.2345")));
        System.out.println("Input -45.67  -> Risultato: " + reverseAndRound(new BigDecimal("-45.67")));
        System.out.println("Input null    -> Risultato: " + reverseAndRound(null));
    }

    /**
     * Inverte il segno e arrotonda al decimo più vicino.
     */
    public static BigDecimal reverseAndRound(BigDecimal value) {
        // Gestione del null: restituisce ZERO per evitare errori
        if (value == null) {
            return BigDecimal.ZERO;
        }

        // Inverte il segno e arrotonda a 1 cifra decimale
        return value.negate()
                .setScale(1, RoundingMode.HALF_UP);
    }
}
