package Int;

import java.util.Arrays;

public class IntArrayList implements IntList {
    private int[] array = new int[10];
    private int size = 0;

    @Override
    public void add(int number) {
        if (size == array.length) {
            // Aumenta del 50% (es. da 10 a 15)
            int newSize = array.length + (array.length / 2);
            array = Arrays.copyOf(array, newSize);
        }
        array[size++] = number;
    }

    @Override
    public int get(int id) {
        if (id < 0 || id >= size) throw new IndexOutOfBoundsException();
        return array[id];
    }
}