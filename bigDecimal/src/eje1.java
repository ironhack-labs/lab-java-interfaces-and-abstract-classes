
import java.math.BigDecimal;
import java.math.RoundingMode;

public class eje1 {

    /**
     * Arrotonda un BigDecimal al centesimo più vicino e lo restituisce come double.
     * Se il valore è null, restituisce 0.0.
     */
    public double roundToHundredth(BigDecimal value) {
        if (value == null) {
            return 0.0;
        }

        // setScale(2, ...) arrotonda alla seconda cifra decimale
        return value.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }
}