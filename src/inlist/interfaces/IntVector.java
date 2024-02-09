package inlist.interfaces;

public class IntVector implements InList {

    private int[] numbers;
    private int lastPosition;
    private final int DEFAULT_VECTOR_SIZE = 20;

    @Override
    public int get(int id) {
        return numbers[id];
    }

    @Override
    public void add(int number) {
        if (numbers == null) {
            numbers = new int[DEFAULT_VECTOR_SIZE];
        } else if (lastPosition == numbers.length - 1) {
            int[] oldNumbers = numbers;
            numbers = new int[numbers.length * 2];
            System.arraycopy(oldNumbers, 0, numbers, 0, oldNumbers.length);
        }
        numbers[lastPosition] = number;
        lastPosition++;
    }

}
