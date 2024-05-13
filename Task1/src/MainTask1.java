import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class MainTask1{

    public static void Round(BigDecimal num)
    {
        BigDecimal a = num;
        BigDecimal roundValue = a.setScale(2,RoundingMode.HALF_UP);
        System.out.println("Original value :" +a );
        System.out.println("Rounded value :"+ roundValue);

    }
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Enter a number:");
            BigDecimal number = scanner.nextBigDecimal();
            Round(number);
            reverse(number);
        }

    }
    public static void reverse(BigDecimal num1){
        BigDecimal a = num1;
        // Reverse the sign
        BigDecimal reversed = a.negate();
        // Round to the nearest tenth
        BigDecimal rounded = reversed.setScale(1, RoundingMode.HALF_UP);
        System.out.println("Reversed Value:" + reversed);
        System.out.println("Rounded number after reversing:" +rounded);
    }

}

