package IntList;

import java.util.Arrays;

public class IntArrayList implements IntList{
    private int[] array;
    private int size;

    public IntArrayList() {
        final int DEFAULT_CAPACITY = 10;
        this.array = new int[10];
        this.size = 0;
    }
    void increaseCapacity(){
        int [] newCapacity = new int[array.length + array.length/2];
        array = Arrays.copyOf(array, newCapacity);
    }
    @Override
    public void addNumber(int number) {
        if (size == array.length){
            increaseCapacity();

        }
        array[size] = number;
        size++;

    }

    @Override
    public int get(int id) {
        if (id < 0 || id >= this.size) {
            throw new IllegalArgumentException("Id doesn't exist");
        }
        return this.array[id];

    }



    }


