package intlist;

public class IntArrayList implements IntList {
    private int[] numbers;
    private int size;

    public IntArrayList() {
        numbers = new int[10];
        size = 0;
    }

    @Override
    public void add(int number) {
        if (size == numbers.length) {
            int[] newNumbers = new int[numbers.length + numbers.length / 2];
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

