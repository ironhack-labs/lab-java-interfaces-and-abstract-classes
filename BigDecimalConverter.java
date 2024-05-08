import java.math.BigDecimal;
import java.math.RoundingMode;


public class BigDecimalConverter {

    private BigDecimal number;
    private BigDecimal secondNumber;

    public BigDecimal roundingMode(BigDecimal number, int scale, RoundingMode roundingMode){
        this.number = number;  // Storing the number if it's needed later in the class

        // Apply rounding to the BigDecimal
        BigDecimal roundedNumber = number.setScale(scale, roundingMode);

        return roundedNumber;  // Return the rounded BigDecimal
    }

    public BigDecimal process(BigDecimal secondNumber) {
        this.secondNumber = secondNumber;

        BigDecimal swap = secondNumber.negate();

        return swap;



    }

}