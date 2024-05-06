package IntListInterface;

import java.util.Arrays;

public class IntVector implements IntList {
    private int [] array;
    private int size;
    private static final int DEFAULT_CAPACITY = 20;
    public IntVector(){
        this.array=new int[DEFAULT_CAPACITY];
        this.size=0;

    }
private void increaseCapacity(){
        int newCapacity = array.length + array.length *2;
        array = Arrays.copyOf(array, newCapacity);;
}

    @Override
    public void add(int number) {
        if (size == array.length){
            increaseCapacity();
        }
        array[size++]=number;

    }

    @Override
    public int get(int id) {
        return 0;
    }
}
