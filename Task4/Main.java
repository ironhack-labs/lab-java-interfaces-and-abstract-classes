package Task4;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        var array = new IntArrayList();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        array.add(5);
        array.add(6);
        array.add(7);
        array.add(8);
        array.add(9);
        array.add(10);
        array.add(11);
        System.out.println("Numbers are: ");
        for (int check = 0; check < array.arrayList.length; check++) {
            if(array.arrayList[check] != null){
                System.out.print(array.arrayList[check] + " ");
            }
        }
        System.out.println("\nIndex: " + array.currentIndex);

        var vector = new IntVector();

        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(5);
        vector.add(6);
        vector.add(7);
        vector.add(8);
        vector.add(9);
        vector.add(10);
        vector.add(11);
        vector.add(12);
        vector.add(13);
        vector.add(14);
        vector.add(15);
        vector.add(16);
        vector.add(17);
        vector.add(18);
        vector.add(19);
        vector.add(20);
        vector.add(21);
        System.out.println("Numbers are: ");
        for (int check = 0; check < vector.numberArray.length; check++) {
            if(vector.numberArray[check] != null){
                System.out.print(vector.numberArray[check] + " ");
            }
        }
        System.out.println("\nIndex: " + vector.currentIndex);


        FileWriter file = new FileWriter("README.md", true);
        file.write("By implementing these classes, we can efficiently manage lists of integers with different resizing strategies based on the requirements of the application. The IntArrayList may be more efficient when memory constraints are a concern, while IntVector may be more efficient when fewer resizings are desired.");
        file.close();
    }
}
