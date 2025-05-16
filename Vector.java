import java.util.Arrays;

public class Vector implements  IntList{
    private int [] numbers = new int[20];
    private int size = 0;

    @Override
    public void add(int number) {
        // if full add twice more spots
        if (size == numbers.length) {
            int expandedLength = numbers.length  * 2;
            int[] expandedArray = new int[expandedLength];
            System.out.println("Vector expanded size: " + expandedLength);
            // new array with updated size

            // copy info
            for (int i = 0; i < size; i++) {
                expandedArray[i] = numbers[i];

            }
            numbers = expandedArray;    // updated reference


        }
        numbers[size] = number;
        size++;
    }

    @Override
    public int get(int id) {
        //System.out.println(numbers[id]);
        return numbers[id];

    }

    @Override
    public String toString() {
        return "IntArrayList{" +
                "numbers=" + Arrays.toString(numbers) +
                ", size=" + size +
                '}';
    }
}

