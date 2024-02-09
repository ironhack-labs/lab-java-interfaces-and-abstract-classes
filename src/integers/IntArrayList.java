package src.integers;

import java.util.ArrayList;
import java.util.List;

public class IntArrayList implements IntList {
    private int[] intArray = new int[10];
    private ArrayList<Integer> storedIntegers = new ArrayList<>();
    private int arraySize = 0;
    private int maxArraySize = 10;

    public void add(int number) {
        if (this.arraySize == this.maxArraySize) {
            this.intArray = new int[this.maxArraySize + (this.maxArraySize / 2)];
            this.storedIntegers.add(number);
            this.intArray = this.storedIntegers.stream().mapToInt(Integer::intValue).toArray();
            this.arraySize += 1;
            this.maxArraySize = this.maxArraySize + (this.maxArraySize / 2);

        } else {
            this.storedIntegers.add(number);
            this.intArray = this.storedIntegers.stream().mapToInt(Integer::intValue).toArray();
            this.arraySize += 1;
        }
    }

    @Override
    public int get(int id) {
        return 0;
    }
}
