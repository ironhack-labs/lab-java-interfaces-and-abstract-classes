package src.integers;

import java.util.ArrayList;

public class IntVector implements IntList {
    private int[] intArray = new int[20];
    private ArrayList<Integer> storedIntegers = new ArrayList<>();
    private int arraySize = 0;
    private int maxArraySize = 20;
    @Override
    public void add(int number) {
        if (this.arraySize == this.maxArraySize) {
            this.intArray = new int[maxArraySize + maxArraySize];
            this.storedIntegers.add(number);
            this.intArray = this.storedIntegers.stream().mapToInt(Integer::intValue).toArray();
            this.arraySize += 1;
            this.maxArraySize = maxArraySize + maxArraySize;

        } else {
            this.storedIntegers.add(number);
            this.intArray = this.storedIntegers.stream().mapToInt(Integer::intValue).toArray();
            this.arraySize += 1;
        }
    }

    @Override
    public int get(int id) {
        if (id < 0 || id >= this.arraySize) {
            throw new IllegalArgumentException("Id doesn't exist");
        }
        return this.intArray[id];
    }
}
