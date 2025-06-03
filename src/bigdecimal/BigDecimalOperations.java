

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalOperations {

    // Método 1: redondear a las centésimas
    public static double roundToHundredth(BigDecimal number) {
        // setScale(2) indica que queremos 2 decimales.
        // RoundingMode.HALF_UP es el tipico redondeo "normal" (hacia arriba si >= 0.5)
        return number.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    // Método 2: cambiar el signo y redondear a décimas
    public static BigDecimal reverseSignAndRoundToTenth(BigDecimal number) {
        BigDecimal reversed = number.negate(); // Cambia el signo
        return reversed.setScale(1, RoundingMode.HALF_UP); // Redondea a 1 decimal
    }
}