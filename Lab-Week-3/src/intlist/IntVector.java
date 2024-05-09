package intlist;

public class IntVector implements IntList {
    private int[] numbers;
    private int size;

    public IntVector() {
        numbers = new int[20];
        size = 0;
    }

    @Override
    public void add(int number) {
        if (size == numbers.length) {
            int[] newNumbers = new int[numbers.length * 2];
            System.arraycopy(numbers, 0, newNumbers, 0, numbers.length);
            numbers = newNumbers;
        }
        numbers[size] = number;
        size++;
    }

    @Override
    public int get(int id) {
        if (id < 0 || id >= size) {
            throw new IndexOutOfBoundsException("Invalid index: " + id);
        }
        return numbers[id];
    }
}
