package Intlist;

public class IntVector implements IntList {
    private int[] array;
    private int size;

    public IntVector() {
        array = new int[20];
        size = 0;
    }

    @Override
    public void add(int number) {
        if (size == array.length) {
            int[] newArray = new int[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
        array[size++] = number;
    }

    @Override
    public int get(int id) {
        return array[id];
    }
}
