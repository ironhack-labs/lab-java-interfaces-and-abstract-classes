import org.junit.jupiter.api.Test;
import java.math.BigDecimal;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BigDecimalOperationsTest {

    @Test
    void testRoundNumberHalfDownScale2() {
        assertEquals(4.25, BigDecimalOperations.roundNumberHalfDownScale2(new BigDecimal(4.2545)));
    }

    @Test
    void TestReverseSignAndRoundNumberScale1() {
        assertEquals(-1.2, BigDecimalOperations.reverseSignAndRoundNumberScale1(new BigDecimal(1.2345)));
        assertEquals(45.7, BigDecimalOperations.reverseSignAndRoundNumberScale1(new BigDecimal(-45.67)));
    }
}