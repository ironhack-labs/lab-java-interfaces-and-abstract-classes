package IntListInterface;

import java.util.Arrays;


public class IntArrayList implements IntList {
    private int [] array;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public IntArrayList(){
        this.array=new int[DEFAULT_CAPACITY];
        this.size=0;

    }

private void increaseCapcaity(){
        int newCapacity =array.length + array.length/2;
        array = Arrays.copyOf(array, newCapacity);
}

    @Override
    public void add(int number) {
        if (size == array.length) {
            increaseCapcaity();
        }
        array[size++] = number;


    }

    @Override
    public int get(int id) {
        return 0;
    }
}
