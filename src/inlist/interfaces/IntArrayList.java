package inlist.interfaces;

public class IntArrayList implements InList {

    private int[] numbers;
    private int lastPosition;
    private final int DEFAULT_ARRAY_SIZE = 10;

    @Override
    public int get(int id) {
        if (id < 0 || id >= lastPosition) {
            throw new IndexOutOfBoundsException("Index: " + id + ", Size: " + lastPosition);
        }
        return numbers[id];
    }

    @Override
    public void add(int number) {
        if (numbers == null) {
            numbers = new int[DEFAULT_ARRAY_SIZE];
        } else if (lastPosition == numbers.length - 1) {
            int[] oldNumbers = numbers;
            numbers = new int[numbers.length + numbers.length / 2];
            System.arraycopy(oldNumbers, 0, numbers, 0, oldNumbers.length);
        }
        numbers[lastPosition] = number;
        lastPosition++;
    }

}
