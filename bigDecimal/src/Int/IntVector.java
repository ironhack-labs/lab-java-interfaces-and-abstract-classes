package Int;

import java.util.Arrays;

public class IntVector implements IntList {
    private int[] array = new int[20];
    private int size = 0;

    @Override
    public void add(int number) {
        if (size == array.length) {
            // Raddoppia la dimensione (es. da 20 a 40)
            int newSize = array.length * 2;
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