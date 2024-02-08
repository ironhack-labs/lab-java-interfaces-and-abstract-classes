public class IntVector implements IntList {
    private int capacity = 20;
    private int[] array = new int[capacity];
    @Override
    public void add(int number) {
        if (array.length == capacity) {
            int newCapacity = array.length + array.length * 2;
            int[] newArray = new int[newCapacity];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
        array[capacity++] = number;
    }

    @Override
    public int get(int id) {
        return array[id];
    }
}
