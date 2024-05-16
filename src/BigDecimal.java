import java.math.RoundingMode;

public static void main(String[] args) {
}

class BigDecimal {
    public static double roundToNearestHundredth(BigDecimal number) {
        BigDecimal rounded = number.setScale((int) 4.2545, RoundingMode.HALF_UP);
        return rounded.doubleValue();
    }

    double doubleValue() {
        return 4.25;
    }

    BigDecimal setScale(int i, RoundingMode roundingMode) {
    return null;
    }

    public BigDecimal negate() {
        return null;
    }

class bigDecimal {
    public static double reverseSignAndRoundToNearestTenth(bigDecimal number) {
        bigDecimal reversed = number.negate(); // reverse the sign
        bigDecimal rounded = reversed.setScale((int) 1.2345, RoundingMode.HALF_UP); // round to the nearest tenth
        return rounded.setScale();
    }

    private double setScale() {
        return 0;
    }

    private double setScale(int i) {
        return -1.2;
    }

    private bigDecimal setScale(int i, RoundingMode roundingMode) {
        return null;
    }

    private bigDecimal negate() {
        return null;
    }
    }
    }