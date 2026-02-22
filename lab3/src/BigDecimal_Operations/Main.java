package BigDecimal_Operations;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) throws Exception {



    }

//BigDecimal Operations
//1
    public double task1Method(BigDecimal bigD){

        return bigD.setScale(2, RoundingMode.HALF_UP).doubleValue();

    }

    //2  signum() checks if biginteger positive negative or 0
    public BigDecimal task2Method(BigDecimal bigD){
        BigDecimal result = bigD.setScale(1, RoundingMode.HALF_UP);

        return result.negate();
    }
}
